package com.zstao.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.zstao.api.entity.User;
import com.zstao.api.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Reference(version = "1.0")
    private UserService usi;


    @ApiOperation(value = "查询用户", notes = "查询所有用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name="pageNum",required = true,value="第几页", dataType = "int",paramType = "path"),
            @ApiImplicitParam(name="pageSize",required =true,value = "页大小",dataType = "int", paramType ="path")
    })
    @GetMapping(value="/listUsers/{pageNum}/{pageSize}",produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResponseEntity listUsers(@PathVariable("pageNum")int pageNum, @PathVariable("pageSize") int pageSize){

        List<User> list=usi.listSUsers(pageNum,pageSize);
        return ResponseEntity.ok(list);
    }

}

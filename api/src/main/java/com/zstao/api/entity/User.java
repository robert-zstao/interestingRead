package com.zstao.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 赵胜涛
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {
    private Integer uid;

    private String uname;

    private String password;

    private Date age;

    private String email;

    private String phone;

    private String nickname;

    private String sex;

    private String introduce;

    private Date createDate;

    private byte[] userImage;

    private static final long serialVersionUID = 1L;


}
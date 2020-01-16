package com.zstao.api.mapper;

import com.zstao.api.entity.Role;

import java.util.List;

/**
 * 权限接口
 */
public interface RoleDao {
    List<Role> listRoles();

    String getRoleName(Integer rid);

    int saveRole(Role role);

    int deleteRole(Integer rid);


}

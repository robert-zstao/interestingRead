package com.zstao.api.mapper;

import com.zstao.api.entity.UserRole;

import java.util.List;

/**
 * 用户权限接口
 */
public interface UserRoleDao {
    List<UserRole> listUserRoles();

    UserRole getUserRole(Integer uroleId);

    int deleteUserRole(Integer uroleId);

    int saveUserRole(UserRole userRole);

    List<UserRole> listUserRoleInfo(Integer userId);

    List<UserRole> listRoleBeUsers(Integer roleId);

    int userRoleNumber();
}

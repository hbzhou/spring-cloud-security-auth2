package com.htisec.oauth2.server.mapper;

import com.htisec.oauth2.server.domain.TbRolePermission;

import org.springframework.stereotype.Repository;

/**
 * TbRolePermissionDAO继承基类
 */
@Repository
public interface TbRolePermissionDAO extends MyBatisBaseDao<TbRolePermission, Long> {
}

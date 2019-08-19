package com.htisec.oauth2.server.mapper;

import com.htisec.oauth2.server.domain.TbUserRole;

import org.springframework.stereotype.Repository;

/**
 * TbUserRoleDAO继承基类
 */
@Repository
public interface TbUserRoleDAO extends MyBatisBaseDao<TbUserRole, Long> {
}

package com.htisec.oauth2.server.mapper;

import com.htisec.oauth2.server.domain.TbRole;

import org.springframework.stereotype.Repository;

/**
 * TbRoleDAO继承基类
 */
@Repository
public interface TbRoleDAO extends MyBatisBaseDao<TbRole, Long> {
}

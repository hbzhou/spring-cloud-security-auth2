package com.htisec.oauth2.server.mapper;

import com.htisec.oauth2.server.domain.TbUser;

import java.util.Optional;

import org.springframework.stereotype.Repository;

/**
 * TbUserDAO继承基类
 */
@Repository
public interface TbUserDAO extends MyBatisBaseDao<TbUser, Long> {

   TbUser findByUserName(String username);
}

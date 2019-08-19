package com.htisec.oauth2.server.mapper;

import com.htisec.oauth2.server.domain.TbPermission;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * TbPermissionDAO继承基类
 */
@Repository
public interface TbPermissionDAO extends MyBatisBaseDao<TbPermission, Long> {

    List<TbPermission> selectByUserId(long userId);
}

package com.htisec.oauth2.resource.mapper;

import com.htisec.oauth2.resource.domain.TbContent;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * TbContentDAO继承基类
 */
@Repository
public interface TbContentDAO extends MyBatisBaseDao<TbContent, Long> {

    List<TbContent> selectAll();
}

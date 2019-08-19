package com.htisec.oauth2.resource.service.impl;

import com.htisec.oauth2.resource.domain.TbContent;
import com.htisec.oauth2.resource.mapper.TbContentDAO;
import com.htisec.oauth2.resource.service.TbContentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentDAO tbContentDAO;

    @Override
    public List<TbContent> findAll() {
        return tbContentDAO.selectAll();
    }
}

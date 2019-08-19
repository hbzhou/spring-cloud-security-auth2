package com.htisec.oauth2.resource.controller;

import com.htisec.oauth2.resource.domain.TbContent;
import com.htisec.oauth2.resource.service.TbContentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;


    @GetMapping("/")
    public List<TbContent> selectAll() {
        return tbContentService.findAll();
    }
}

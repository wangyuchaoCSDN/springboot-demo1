package com.hp.springbootdemo1.service.impl;

import com.hp.springbootdemo1.mapper.UserinfoMapper;
import com.hp.springbootdemo1.pojo.Userinfo;
import com.hp.springbootdemo1.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public List<Userinfo> findAll() {
        return userinfoMapper.findAll();
    }
}

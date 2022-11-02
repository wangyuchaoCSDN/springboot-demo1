package com.hp.springbootdemo1.mapper;

import com.hp.springbootdemo1.pojo.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserinfoMapper {

    List<Userinfo> findAll();
}

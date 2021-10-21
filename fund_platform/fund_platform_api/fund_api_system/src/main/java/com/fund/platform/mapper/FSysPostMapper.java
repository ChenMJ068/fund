package com.fund.platform.mapper;

import com.fund.platform.bean.FSysPost;
import com.fund.platform.bean.FSysPostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysPostMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysPostMapper {
    int countByExample(FSysPostExample example);

    int deleteByExample(FSysPostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysPost record);

    int insertSelective(FSysPost record);

    List<FSysPost> selectByExample(FSysPostExample example);

    FSysPost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysPost record, @Param("example") FSysPostExample example);

    int updateByExample(@Param("record") FSysPost record, @Param("example") FSysPostExample example);

    int updateByPrimaryKeySelective(FSysPost record);

    int updateByPrimaryKey(FSysPost record);
}
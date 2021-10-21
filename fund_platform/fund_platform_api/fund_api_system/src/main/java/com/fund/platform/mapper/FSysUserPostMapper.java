package com.fund.platform.mapper;

import com.fund.platform.bean.FSysUserPost;
import com.fund.platform.bean.FSysUserPostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysUserPostMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysUserPostMapper {
    int countByExample(FSysUserPostExample example);

    int deleteByExample(FSysUserPostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysUserPost record);

    int insertSelective(FSysUserPost record);

    List<FSysUserPost> selectByExample(FSysUserPostExample example);

    FSysUserPost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysUserPost record, @Param("example") FSysUserPostExample example);

    int updateByExample(@Param("record") FSysUserPost record, @Param("example") FSysUserPostExample example);

    int updateByPrimaryKeySelective(FSysUserPost record);

    int updateByPrimaryKey(FSysUserPost record);
}
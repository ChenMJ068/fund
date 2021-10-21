package com.fund.platform.mapper;

import com.fund.platform.bean.FSysUser;
import com.fund.platform.bean.FSysUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysUserMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysUserMapper {
    int countByExample(FSysUserExample example);

    int deleteByExample(FSysUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysUser record);

    int insertSelective(FSysUser record);

    List<FSysUser> selectByExample(FSysUserExample example);

    FSysUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysUser record, @Param("example") FSysUserExample example);

    int updateByExample(@Param("record") FSysUser record, @Param("example") FSysUserExample example);

    int updateByPrimaryKeySelective(FSysUser record);

    int updateByPrimaryKey(FSysUser record);
}
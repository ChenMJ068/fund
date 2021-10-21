package com.fund.platform.mapper;

import com.fund.platform.bean.FSysRole;
import com.fund.platform.bean.FSysRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysRoleMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysRoleMapper {
    int countByExample(FSysRoleExample example);

    int deleteByExample(FSysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysRole record);

    int insertSelective(FSysRole record);

    List<FSysRole> selectByExample(FSysRoleExample example);

    FSysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysRole record, @Param("example") FSysRoleExample example);

    int updateByExample(@Param("record") FSysRole record, @Param("example") FSysRoleExample example);

    int updateByPrimaryKeySelective(FSysRole record);

    int updateByPrimaryKey(FSysRole record);
}
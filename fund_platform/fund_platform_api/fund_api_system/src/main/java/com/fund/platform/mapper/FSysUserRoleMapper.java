package com.fund.platform.mapper;

import com.fund.platform.bean.FSysUserRole;
import com.fund.platform.bean.FSysUserRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysUserRoleMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysUserRoleMapper {
    int countByExample(FSysUserRoleExample example);

    int deleteByExample(FSysUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysUserRole record);

    int insertSelective(FSysUserRole record);

    List<FSysUserRole> selectByExample(FSysUserRoleExample example);

    FSysUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysUserRole record, @Param("example") FSysUserRoleExample example);

    int updateByExample(@Param("record") FSysUserRole record, @Param("example") FSysUserRoleExample example);

    int updateByPrimaryKeySelective(FSysUserRole record);

    int updateByPrimaryKey(FSysUserRole record);
}
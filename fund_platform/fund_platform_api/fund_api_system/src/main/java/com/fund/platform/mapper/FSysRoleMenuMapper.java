package com.fund.platform.mapper;

import com.fund.platform.bean.FSysRoleMenu;
import com.fund.platform.bean.FSysRoleMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysRoleMenuMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysRoleMenuMapper {
    int countByExample(FSysRoleMenuExample example);

    int deleteByExample(FSysRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysRoleMenu record);

    int insertSelective(FSysRoleMenu record);

    List<FSysRoleMenu> selectByExample(FSysRoleMenuExample example);

    FSysRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysRoleMenu record, @Param("example") FSysRoleMenuExample example);

    int updateByExample(@Param("record") FSysRoleMenu record, @Param("example") FSysRoleMenuExample example);

    int updateByPrimaryKeySelective(FSysRoleMenu record);

    int updateByPrimaryKey(FSysRoleMenu record);
}
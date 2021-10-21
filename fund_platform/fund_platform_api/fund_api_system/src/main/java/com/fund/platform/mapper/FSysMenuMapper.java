package com.fund.platform.mapper;

import com.fund.platform.bean.FSysMenu;
import com.fund.platform.bean.FSysMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysMenuMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysMenuMapper {
    int countByExample(FSysMenuExample example);

    int deleteByExample(FSysMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysMenu record);

    int insertSelective(FSysMenu record);

    List<FSysMenu> selectByExample(FSysMenuExample example);

    FSysMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysMenu record, @Param("example") FSysMenuExample example);

    int updateByExample(@Param("record") FSysMenu record, @Param("example") FSysMenuExample example);

    int updateByPrimaryKeySelective(FSysMenu record);

    int updateByPrimaryKey(FSysMenu record);
}
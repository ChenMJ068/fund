package com.fund.platform.mapper;

import com.fund.platform.bean.FSysUserOnline;
import com.fund.platform.bean.FSysUserOnlineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysUserOnlineMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysUserOnlineMapper {
    int countByExample(FSysUserOnlineExample example);

    int deleteByExample(FSysUserOnlineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysUserOnline record);

    int insertSelective(FSysUserOnline record);

    List<FSysUserOnline> selectByExample(FSysUserOnlineExample example);

    FSysUserOnline selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysUserOnline record, @Param("example") FSysUserOnlineExample example);

    int updateByExample(@Param("record") FSysUserOnline record, @Param("example") FSysUserOnlineExample example);

    int updateByPrimaryKeySelective(FSysUserOnline record);

    int updateByPrimaryKey(FSysUserOnline record);
}
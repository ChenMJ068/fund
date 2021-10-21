package com.fund.platform.mapper;

import com.fund.platform.bean.FSysLoginInfo;
import com.fund.platform.bean.FSysLoginInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysLoginInfoMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysLoginInfoMapper {
    int countByExample(FSysLoginInfoExample example);

    int deleteByExample(FSysLoginInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysLoginInfo record);

    int insertSelective(FSysLoginInfo record);

    List<FSysLoginInfo> selectByExample(FSysLoginInfoExample example);

    FSysLoginInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysLoginInfo record, @Param("example") FSysLoginInfoExample example);

    int updateByExample(@Param("record") FSysLoginInfo record, @Param("example") FSysLoginInfoExample example);

    int updateByPrimaryKeySelective(FSysLoginInfo record);

    int updateByPrimaryKey(FSysLoginInfo record);
}
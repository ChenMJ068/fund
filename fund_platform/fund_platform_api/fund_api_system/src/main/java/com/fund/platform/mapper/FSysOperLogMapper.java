package com.fund.platform.mapper;

import com.fund.platform.bean.FSysOperLog;
import com.fund.platform.bean.FSysOperLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysOperLogMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysOperLogMapper {
    int countByExample(FSysOperLogExample example);

    int deleteByExample(FSysOperLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysOperLog record);

    int insertSelective(FSysOperLog record);

    List<FSysOperLog> selectByExample(FSysOperLogExample example);

    FSysOperLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysOperLog record, @Param("example") FSysOperLogExample example);

    int updateByExample(@Param("record") FSysOperLog record, @Param("example") FSysOperLogExample example);

    int updateByPrimaryKeySelective(FSysOperLog record);

    int updateByPrimaryKey(FSysOperLog record);
}
package com.fund.platform.mapper;

import com.fund.platform.bean.FSysConfig;
import com.fund.platform.bean.FSysConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * create class FSysConfigMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysConfigMapper {
    int countByExample(FSysConfigExample example);

    int deleteByExample(FSysConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FSysConfig record);

    int insertSelective(FSysConfig record);

    List<FSysConfig> selectByExample(FSysConfigExample example);

    FSysConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FSysConfig record, @Param("example") FSysConfigExample example);

    int updateByExample(@Param("record") FSysConfig record, @Param("example") FSysConfigExample example);

    int updateByPrimaryKeySelective(FSysConfig record);

    int updateByPrimaryKey(FSysConfig record);
}
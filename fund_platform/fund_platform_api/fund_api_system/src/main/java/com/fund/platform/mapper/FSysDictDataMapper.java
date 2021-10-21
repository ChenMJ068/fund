package com.fund.platform.mapper;

import com.fund.platform.bean.FSysDictData;
import com.fund.platform.bean.FSysDictDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysDictDataMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysDictDataMapper {
    int countByExample(FSysDictDataExample example);

    int deleteByExample(FSysDictDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysDictData record);

    int insertSelective(FSysDictData record);

    List<FSysDictData> selectByExample(FSysDictDataExample example);

    FSysDictData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysDictData record, @Param("example") FSysDictDataExample example);

    int updateByExample(@Param("record") FSysDictData record, @Param("example") FSysDictDataExample example);

    int updateByPrimaryKeySelective(FSysDictData record);

    int updateByPrimaryKey(FSysDictData record);
}
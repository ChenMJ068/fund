package com.fund.platform.mapper;

import com.fund.platform.bean.FSysDictType;
import com.fund.platform.bean.FSysDictTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysDictTypeMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysDictTypeMapper {
    int countByExample(FSysDictTypeExample example);

    int deleteByExample(FSysDictTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysDictType record);

    int insertSelective(FSysDictType record);

    List<FSysDictType> selectByExample(FSysDictTypeExample example);

    FSysDictType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysDictType record, @Param("example") FSysDictTypeExample example);

    int updateByExample(@Param("record") FSysDictType record, @Param("example") FSysDictTypeExample example);

    int updateByPrimaryKeySelective(FSysDictType record);

    int updateByPrimaryKey(FSysDictType record);
}
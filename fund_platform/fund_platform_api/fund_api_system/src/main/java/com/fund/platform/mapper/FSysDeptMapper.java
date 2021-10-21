package com.fund.platform.mapper;

import com.fund.platform.bean.FSysDept;
import com.fund.platform.bean.FSysDeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysDeptMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysDeptMapper {
    int countByExample(FSysDeptExample example);

    int deleteByExample(FSysDeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysDept record);

    int insertSelective(FSysDept record);

    List<FSysDept> selectByExample(FSysDeptExample example);

    FSysDept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysDept record, @Param("example") FSysDeptExample example);

    int updateByExample(@Param("record") FSysDept record, @Param("example") FSysDeptExample example);

    int updateByPrimaryKeySelective(FSysDept record);

    int updateByPrimaryKey(FSysDept record);
}
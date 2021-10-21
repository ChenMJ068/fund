package com.fund.platform.mapper;

import com.fund.platform.bean.FSysRoleDept;
import com.fund.platform.bean.FSysRoleDeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysRoleDeptMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysRoleDeptMapper {
    int countByExample(FSysRoleDeptExample example);

    int deleteByExample(FSysRoleDeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysRoleDept record);

    int insertSelective(FSysRoleDept record);

    List<FSysRoleDept> selectByExample(FSysRoleDeptExample example);

    FSysRoleDept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysRoleDept record, @Param("example") FSysRoleDeptExample example);

    int updateByExample(@Param("record") FSysRoleDept record, @Param("example") FSysRoleDeptExample example);

    int updateByPrimaryKeySelective(FSysRoleDept record);

    int updateByPrimaryKey(FSysRoleDept record);
}
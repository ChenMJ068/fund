package com.fund.platform.mapper;

import com.fund.platform.bean.FSysMailTemplate;
import com.fund.platform.bean.FSysMailTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysMailTemplateMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysMailTemplateMapper {
    int countByExample(FSysMailTemplateExample example);

    int deleteByExample(FSysMailTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysMailTemplate record);

    int insertSelective(FSysMailTemplate record);

    List<FSysMailTemplate> selectByExampleWithBLOBs(FSysMailTemplateExample example);

    List<FSysMailTemplate> selectByExample(FSysMailTemplateExample example);

    FSysMailTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysMailTemplate record, @Param("example") FSysMailTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") FSysMailTemplate record, @Param("example") FSysMailTemplateExample example);

    int updateByExample(@Param("record") FSysMailTemplate record, @Param("example") FSysMailTemplateExample example);

    int updateByPrimaryKeySelective(FSysMailTemplate record);

    int updateByPrimaryKeyWithBLOBs(FSysMailTemplate record);

    int updateByPrimaryKey(FSysMailTemplate record);
}
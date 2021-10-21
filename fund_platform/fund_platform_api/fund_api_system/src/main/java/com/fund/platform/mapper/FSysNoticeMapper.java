package com.fund.platform.mapper;

import com.fund.platform.bean.FSysNotice;
import com.fund.platform.bean.FSysNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysNoticeMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysNoticeMapper {
    int countByExample(FSysNoticeExample example);

    int deleteByExample(FSysNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FSysNotice record);

    int insertSelective(FSysNotice record);

    List<FSysNotice> selectByExample(FSysNoticeExample example);

    FSysNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FSysNotice record, @Param("example") FSysNoticeExample example);

    int updateByExample(@Param("record") FSysNotice record, @Param("example") FSysNoticeExample example);

    int updateByPrimaryKeySelective(FSysNotice record);

    int updateByPrimaryKey(FSysNotice record);
}
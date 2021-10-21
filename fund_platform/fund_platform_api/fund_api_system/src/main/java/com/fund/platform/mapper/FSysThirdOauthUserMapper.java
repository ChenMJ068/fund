package com.fund.platform.mapper;

import com.fund.platform.bean.FSysThirdOauthUser;
import com.fund.platform.bean.FSysThirdOauthUserExample;
import com.fund.platform.bean.FSysThirdOauthUserWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * create class FSysThirdOauthUserMapper.java @version 1.0.0 by @author ChenMJ @date 2021-09-16 17:47:00
 */
public interface FSysThirdOauthUserMapper {
    int countByExample(FSysThirdOauthUserExample example);

    int deleteByExample(FSysThirdOauthUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FSysThirdOauthUserWithBLOBs record);

    int insertSelective(FSysThirdOauthUserWithBLOBs record);

    List<FSysThirdOauthUserWithBLOBs> selectByExampleWithBLOBs(FSysThirdOauthUserExample example);

    List<FSysThirdOauthUser> selectByExample(FSysThirdOauthUserExample example);

    FSysThirdOauthUserWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FSysThirdOauthUserWithBLOBs record, @Param("example") FSysThirdOauthUserExample example);

    int updateByExampleWithBLOBs(@Param("record") FSysThirdOauthUserWithBLOBs record, @Param("example") FSysThirdOauthUserExample example);

    int updateByExample(@Param("record") FSysThirdOauthUser record, @Param("example") FSysThirdOauthUserExample example);

    int updateByPrimaryKeySelective(FSysThirdOauthUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FSysThirdOauthUserWithBLOBs record);

    int updateByPrimaryKey(FSysThirdOauthUser record);
}
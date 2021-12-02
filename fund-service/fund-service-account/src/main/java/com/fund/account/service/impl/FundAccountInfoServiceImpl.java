package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountInfoMapper;
import com.fund.account.domain.FundAccountInfo;
import com.fund.account.service.IFundAccountInfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountInfoServiceImpl implements IFundAccountInfoService 
{
    @Autowired
    private FundAccountInfoMapper fundAccountInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param accId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountInfo selectFundAccountInfoByAccId(Integer accId)
    {
        return fundAccountInfoMapper.selectFundAccountInfoByAccId(accId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountInfo> selectFundAccountInfoList(FundAccountInfo fundAccountInfo)
    {
        return fundAccountInfoMapper.selectFundAccountInfoList(fundAccountInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountInfo(FundAccountInfo fundAccountInfo)
    {
        fundAccountInfo.setCreateTime(DateUtils.getNowDate());
        return fundAccountInfoMapper.insertFundAccountInfo(fundAccountInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountInfo(FundAccountInfo fundAccountInfo)
    {
        fundAccountInfo.setUpdateTime(DateUtils.getNowDate());
        return fundAccountInfoMapper.updateFundAccountInfo(fundAccountInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param accIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountInfoByAccIds(Integer[] accIds)
    {
        return fundAccountInfoMapper.deleteFundAccountInfoByAccIds(accIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param accId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountInfoByAccId(Integer accId)
    {
        return fundAccountInfoMapper.deleteFundAccountInfoByAccId(accId);
    }
}

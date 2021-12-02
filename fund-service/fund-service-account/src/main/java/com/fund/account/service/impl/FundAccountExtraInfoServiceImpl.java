package com.fund.account.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountExtraInfoMapper;
import com.fund.account.domain.FundAccountExtraInfo;
import com.fund.account.service.IFundAccountExtraInfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountExtraInfoServiceImpl implements IFundAccountExtraInfoService 
{
    @Autowired
    private FundAccountExtraInfoMapper fundAccountExtraInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountExtraInfo selectFundAccountExtraInfoById(Integer id)
    {
        return fundAccountExtraInfoMapper.selectFundAccountExtraInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountExtraInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountExtraInfo> selectFundAccountExtraInfoList(FundAccountExtraInfo fundAccountExtraInfo)
    {
        return fundAccountExtraInfoMapper.selectFundAccountExtraInfoList(fundAccountExtraInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountExtraInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountExtraInfo(FundAccountExtraInfo fundAccountExtraInfo)
    {
        return fundAccountExtraInfoMapper.insertFundAccountExtraInfo(fundAccountExtraInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountExtraInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountExtraInfo(FundAccountExtraInfo fundAccountExtraInfo)
    {
        return fundAccountExtraInfoMapper.updateFundAccountExtraInfo(fundAccountExtraInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountExtraInfoByIds(Integer[] ids)
    {
        return fundAccountExtraInfoMapper.deleteFundAccountExtraInfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountExtraInfoById(Integer id)
    {
        return fundAccountExtraInfoMapper.deleteFundAccountExtraInfoById(id);
    }
}

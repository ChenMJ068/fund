package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountChangeDetailMapper;
import com.fund.account.domain.FundAccountChangeDetail;
import com.fund.account.service.IFundAccountChangeDetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountChangeDetailServiceImpl implements IFundAccountChangeDetailService 
{
    @Autowired
    private FundAccountChangeDetailMapper fundAccountChangeDetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountChangeDetail selectFundAccountChangeDetailById(Integer id)
    {
        return fundAccountChangeDetailMapper.selectFundAccountChangeDetailById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountChangeDetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountChangeDetail> selectFundAccountChangeDetailList(FundAccountChangeDetail fundAccountChangeDetail)
    {
        return fundAccountChangeDetailMapper.selectFundAccountChangeDetailList(fundAccountChangeDetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountChangeDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountChangeDetail(FundAccountChangeDetail fundAccountChangeDetail)
    {
        fundAccountChangeDetail.setCreateTime(DateUtils.getNowDate());
        return fundAccountChangeDetailMapper.insertFundAccountChangeDetail(fundAccountChangeDetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountChangeDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountChangeDetail(FundAccountChangeDetail fundAccountChangeDetail)
    {
        fundAccountChangeDetail.setUpdateTime(DateUtils.getNowDate());
        return fundAccountChangeDetailMapper.updateFundAccountChangeDetail(fundAccountChangeDetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountChangeDetailByIds(Integer[] ids)
    {
        return fundAccountChangeDetailMapper.deleteFundAccountChangeDetailByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountChangeDetailById(Integer id)
    {
        return fundAccountChangeDetailMapper.deleteFundAccountChangeDetailById(id);
    }
}

package com.fund.account.service.impl;

import java.util.List;
import com.fund.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fund.account.mapper.FundAccountLogoutMapper;
import com.fund.account.domain.FundAccountLogout;
import com.fund.account.service.IFundAccountLogoutService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
@Service
public class FundAccountLogoutServiceImpl implements IFundAccountLogoutService 
{
    @Autowired
    private FundAccountLogoutMapper fundAccountLogoutMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public FundAccountLogout selectFundAccountLogoutById(Integer id)
    {
        return fundAccountLogoutMapper.selectFundAccountLogoutById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountLogout 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<FundAccountLogout> selectFundAccountLogoutList(FundAccountLogout fundAccountLogout)
    {
        return fundAccountLogoutMapper.selectFundAccountLogoutList(fundAccountLogout);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountLogout 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertFundAccountLogout(FundAccountLogout fundAccountLogout)
    {
        fundAccountLogout.setCreateTime(DateUtils.getNowDate());
        return fundAccountLogoutMapper.insertFundAccountLogout(fundAccountLogout);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountLogout 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateFundAccountLogout(FundAccountLogout fundAccountLogout)
    {
        fundAccountLogout.setUpdateTime(DateUtils.getNowDate());
        return fundAccountLogoutMapper.updateFundAccountLogout(fundAccountLogout);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountLogoutByIds(Integer[] ids)
    {
        return fundAccountLogoutMapper.deleteFundAccountLogoutByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteFundAccountLogoutById(Integer id)
    {
        return fundAccountLogoutMapper.deleteFundAccountLogoutById(id);
    }
}

package com.fund.account.service;

import java.util.List;
import com.fund.account.domain.FundAccountChange;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface IFundAccountChangeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountChange selectFundAccountChangeById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountChange 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountChange> selectFundAccountChangeList(FundAccountChange fundAccountChange);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountChange 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountChange(FundAccountChange fundAccountChange);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountChange 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountChange(FundAccountChange fundAccountChange);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteFundAccountChangeByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountChangeById(Integer id);
}

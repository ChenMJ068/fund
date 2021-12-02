package com.fund.account.service;

import java.util.List;
import com.fund.account.domain.FundAccountFreezeAndUnfreeze;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface IFundAccountFreezeAndUnfreezeService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountFreezeAndUnfreeze selectFundAccountFreezeAndUnfreezeById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountFreezeAndUnfreeze 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountFreezeAndUnfreeze> selectFundAccountFreezeAndUnfreezeList(FundAccountFreezeAndUnfreeze fundAccountFreezeAndUnfreeze);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountFreezeAndUnfreeze 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountFreezeAndUnfreeze(FundAccountFreezeAndUnfreeze fundAccountFreezeAndUnfreeze);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountFreezeAndUnfreeze 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountFreezeAndUnfreeze(FundAccountFreezeAndUnfreeze fundAccountFreezeAndUnfreeze);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteFundAccountFreezeAndUnfreezeByIds(Integer[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountFreezeAndUnfreezeById(Integer id);
}

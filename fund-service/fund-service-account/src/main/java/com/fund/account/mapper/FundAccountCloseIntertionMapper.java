package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountCloseIntertion;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountCloseIntertionMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountCloseIntertion selectFundAccountCloseIntertionById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountCloseIntertion 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountCloseIntertion> selectFundAccountCloseIntertionList(FundAccountCloseIntertion fundAccountCloseIntertion);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountCloseIntertion 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountCloseIntertion(FundAccountCloseIntertion fundAccountCloseIntertion);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountCloseIntertion 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountCloseIntertion(FundAccountCloseIntertion fundAccountCloseIntertion);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountCloseIntertionById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountCloseIntertionByIds(Integer[] ids);
}

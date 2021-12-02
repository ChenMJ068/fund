package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountInfo;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountInfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param accId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountInfo selectFundAccountInfoByAccId(Integer accId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountInfo> selectFundAccountInfoList(FundAccountInfo fundAccountInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountInfo(FundAccountInfo fundAccountInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountInfo(FundAccountInfo fundAccountInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param accId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountInfoByAccId(Integer accId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param accIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountInfoByAccIds(Integer[] accIds);
}

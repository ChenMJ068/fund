package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountExtraInfo;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountExtraInfoMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountExtraInfo selectFundAccountExtraInfoById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountExtraInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountExtraInfo> selectFundAccountExtraInfoList(FundAccountExtraInfo fundAccountExtraInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountExtraInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountExtraInfo(FundAccountExtraInfo fundAccountExtraInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountExtraInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountExtraInfo(FundAccountExtraInfo fundAccountExtraInfo);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountExtraInfoById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountExtraInfoByIds(Integer[] ids);
}

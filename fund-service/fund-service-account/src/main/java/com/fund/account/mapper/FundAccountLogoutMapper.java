package com.fund.account.mapper;

import java.util.List;
import com.fund.account.domain.FundAccountLogout;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ChenMJ
 * @date 2021-11-30
 */
public interface FundAccountLogoutMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public FundAccountLogout selectFundAccountLogoutById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param fundAccountLogout 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<FundAccountLogout> selectFundAccountLogoutList(FundAccountLogout fundAccountLogout);

    /**
     * 新增【请填写功能名称】
     * 
     * @param fundAccountLogout 【请填写功能名称】
     * @return 结果
     */
    public int insertFundAccountLogout(FundAccountLogout fundAccountLogout);

    /**
     * 修改【请填写功能名称】
     * 
     * @param fundAccountLogout 【请填写功能名称】
     * @return 结果
     */
    public int updateFundAccountLogout(FundAccountLogout fundAccountLogout);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteFundAccountLogoutById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFundAccountLogoutByIds(Integer[] ids);
}

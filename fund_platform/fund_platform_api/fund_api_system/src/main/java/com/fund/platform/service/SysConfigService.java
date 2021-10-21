package com.fund.platform.service;

import com.fund.platform.base.PageParam;
import com.fund.platform.base.PageResult;
import com.fund.platform.bean.FSysConfig;

/**
 * create class SysConfigService.java @version 1.0.0 by @author ChenMJ @date 2021-10-21 16:12:00
 */
public interface SysConfigService {
    /**
     * 根据QueryObject查询分页数据
     *
     * @param pageParam   分页参数
     * @param sysConfigQO 查询参数对象
     * @return 分页数据
     */
    PageResult<FSysConfig> queryPage(PageParam pageParam, FSysConfig sysConfigQO);

    /**
     * 根据配置key获取对应value
     *
     * @param confKey 配置key
     * @return confValue
     */
    String getConfValueByKey(String confKey);

    /**
     * 根据 confKey 进行更新
     *
     * @param sysConfig 系统配置
     * @return 更新是否成功
     */
    boolean updateByKey(FSysConfig sysConfig);

    /**
     * 根据 confKey 进行删除
     *
     * @param confKey 配置key
     * @return 删除是否成功
     */
    boolean removeByKey(String confKey);
}

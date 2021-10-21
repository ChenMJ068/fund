package com.fund.platform.controller;

import com.fund.platform.base.PageParam;
import com.fund.platform.base.PageResult;
import com.fund.platform.base.RespResult;
import com.fund.platform.bean.FSysConfig;
import com.fund.platform.service.SysConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 参数配置表
 * create class SysConfigController.java @version 1.0.0 by @author ChenMJ @date 2021-10-21 15:46:00
 */
@RestController
@RequestMapping("/sys/config")
@RequiredArgsConstructor
public class SysConfigController {

    private final SysConfigService sysConfigService;

    /**
     * 分页查询
     * @param pageParam   分页参数
     * @param sysConfigQO 系统配置
     * @return R<PageResult   <   SysConfigVO>>
     */
    @GetMapping("/page")
    public RespResult<PageResult<FSysConfig>> getSysConfigPage(PageParam pageParam, FSysConfig sysConfigQO) {
        try{
            return RespResult.succeed(sysConfigService.queryPage(pageParam, sysConfigQO));
        }catch (RuntimeException e){
            return RespResult.serverErr();
        }

    }

    /**
     * 新增系统配置
     * @param sysConfig 系统配置
     * @return R
     */
    @PostMapping
    public RespResult save(@RequestBody FSysConfig sysConfig) {
        try {
           // return RespResult.succeed(sysConfigService.save(sysConfig));
            return null;
        }catch (RuntimeException e){
            return RespResult.serverErr();
        }

    }

    /**
     * 修改系统配置
     * @param sysConfig 系统配置
     * @return R
     */
    @PutMapping
    public RespResult updateById(@RequestBody FSysConfig sysConfig) {
        try {
            return RespResult.succeed(sysConfigService.updateByKey(sysConfig));
        }catch (RuntimeException e){
            return RespResult.serverErr();
        }
    }

    /**
     * 删除系统配置
     * @param confKey confKey
     * @return R
     */
    @DeleteMapping
    public RespResult removeById(@RequestParam("confKey") String confKey) {
        try {
            return RespResult.succeed(sysConfigService.removeByKey(confKey));
        }catch (RuntimeException e){
            return RespResult.serverErr();
        }
    }

}

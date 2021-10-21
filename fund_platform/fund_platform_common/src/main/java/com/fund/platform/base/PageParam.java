package com.fund.platform.base;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * create class PageParam.java @version 1.0.0 by @author ChenMJ @date 2021-10-21 17:01:00
 */
@Data
public class PageParam {
    /**
     * 当前页
     */

    //@NotNull(message = "当前页码不能为空")
    //@Min(value = 1, message = "当前页不能小于 1")
    private long current = 1;

    /**
     * 每页显示条数，默认 10
     */

    //@NotNull(message = "每页条数不能为空")
    //@Range(min = 1, max = 100, message = "条数范围为 [1, 100]")
    private long size = 10;

    private List<Sort> sorts = new ArrayList<>();

    @Getter
    @Setter
    public static class Sort {

        /**
         * 排序字段
         */
        private String field;

        /**
         * 是否正序排序
         */
        private boolean asc;

    }

}

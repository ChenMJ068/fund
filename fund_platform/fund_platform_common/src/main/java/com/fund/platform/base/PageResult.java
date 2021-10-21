package com.fund.platform.base;

import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * create class PageResult.java @version 1.0.0 by @author ChenMJ @date 2021-10-21 17:03:00
 */
@Data
public class PageResult<T> {
    /**
     * 查询数据列表
     */
    protected List<T> records = Collections.emptyList();

    /**
     * 总数
     */
    protected Long total = 0L;

    public PageResult() {
    }

    public PageResult(long total) {
        this.total = total;
    }

    public PageResult(List<T> records, long total) {
        this.records = records;
        this.total = total;
    }
}

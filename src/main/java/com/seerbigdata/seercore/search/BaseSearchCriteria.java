package com.seerbigdata.seercore.search;

import java.io.Serializable;
import java.util.Set;

/**
 * 基础查询对象
 *
 * @author : yangjunqing / yangjunqing@seerbigdata.com
 * @version : 1.0
 */
public abstract class BaseSearchCriteria implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6686103841929106216L;

    /**
     * 默认页数
     */
    private final static long DEFAULT_PAGE = 1;

    /**
     * 默认显示数量
     */
    private final static long DEFAULT_SIZE = 10;

    /**
     * 最大显示数量
     */
    private final static long MAX_SIZE = 100;

    /**
     * 范围分隔符
     */
    private final static String IN_SPLIT = ",";


    /**
     * 页数
     */
    private long page;

    /**
     * 页码显示数量
     */
    private long size;

    /**
     * 排序字段
     */
    private String field;

    /**
     * 排序方向
     */
    private Order order;

    /**
     * Search params
     */
    private Set<SearchParam> searchParams;


    /**
     * 排序枚举
     *
     * @author : yangjunqing / yangjunqing@seerbigdata.com
     * @version : 1.0
     */
    public enum Order {
        /**
         * 升序.
         */
        asc,
        /**
         * 降序.
         */
        desc
    }
}

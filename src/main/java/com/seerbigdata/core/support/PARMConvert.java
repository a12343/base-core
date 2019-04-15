package com.seerbigdata.core.support;

import java.util.List;

/**
 * parm与entity互相转换
 *
 * @param <T> the type parameter
 * @param <P> the type parameter
 * @author : yangjunqing / yangjunqing@seerbigdata.com
 * @version : 1.0
 */
public interface PARMConvert<T, P> {

    /**
     * PARM转实体.
     *
     * @param d     the d
     * @param clazz the clazz
     * @return the t
     * @author : yangjunqing / 2019-04-13
     */
    T parmToEntity(P d, Class<T> clazz);

    /**
     * PARM转实体.
     *
     * @param pList the p list
     * @param clazz the clazz
     * @return the list
     * @author : yangjunqing / 2019-04-13
     */
    List<T> parmToEntity(List<P> pList, Class<T> clazz);
}

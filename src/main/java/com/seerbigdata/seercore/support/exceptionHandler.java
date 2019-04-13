package com.seerbigdata.seercore.support;

import com.seerbigdata.seercore.entity.GlobalException;
import com.seerbigdata.seercore.entity.ResponseData;

/**
 * 异常处理
 * @author : yangjunqing / yangjunqing@seerbigdata.com
 * @version : 1.0
 */
public abstract class exceptionHandler {

    /**
     * 未知异常处理.
     *
     * @param e the e
     * @return the response data
     * @author : yangjunqing / 2019-04-13
     */
    public abstract ResponseData exceptionHandler(Exception e);

    /**
     * 已知异常处理.
     *
     * @param e the e
     * @return the response data
     * @author : yangjunqing / 2019-04-13
     */
    public abstract ResponseData globalExceptionHandler(GlobalException e);
}

package com.ljq.demo.springboot.web.controller;

import com.ljq.demo.springboot.common.api.ApiResult;
import com.ljq.demo.springboot.common.api.ResponseCode;
import com.ljq.demo.springboot.common.exception.ParamsCheckException;
import com.ljq.demo.springboot.service.Ehcache3Service;
import com.ljq.demo.springboot.vo.ehcache3.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: Ehcache 3 示例控制中心
 * @Author: junqiang.lu
 * @Date: 2019/3/21
 */
@RestController
@RequestMapping(value = "api/ehcache3")
@Slf4j
public class Ehcache3Controller {

    @Autowired
    private Ehcache3Service ehcache3Service;

    /**
     * 不使用缓存
     *
     * @param noCacheBean
     * @return
     */
    @PostMapping(value = "noCache")
    public ApiResult noCache(@RequestBody NoCacheBean noCacheBean) {

        ApiResult apiResult = null;
        try {
            apiResult = ehcache3Service.noCache(noCacheBean);
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }

    /**
     * 使用 @CacheResult 注解
     *
     * @param cacheResultBean
     * @return
     */
    @PostMapping(value = "cacheResult")
    public ApiResult cacheResult(@RequestBody CacheResultBean cacheResultBean) {

        ApiResult apiResult = null;
        try {
            apiResult = ehcache3Service.cacheResult(cacheResultBean);
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }

    /**
     * 使用 @CachePut 注解
     *
     * @param cacheResultBean
     * @return
     */
    @PostMapping(value = "cachePut")
    public ApiResult cachePut(@RequestBody CachePutBean cacheResultBean) {

        ApiResult apiResult = null;
        try {
            ehcache3Service.cachePut(cacheResultBean,ApiResult.success());
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }

    /**
     * 校验 @CachePut 注解
     *
     * @param cachePutBean
     * @return
     */
    @PostMapping(value = "cachePutValidate")
    public ApiResult cachePutValidate(@RequestBody CachePutBean cachePutBean) {

        ApiResult apiResult = null;
        try {
            apiResult = ehcache3Service.cachePutValidate(cachePutBean);
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }

    /**
     * 使用 @CacheRemove 注解
     *
     * @param cacheRemoveBean
     * @return
     */
    @PostMapping(value = "cacheRemove")
    public ApiResult cacheRemove(@RequestBody CacheRemoveBean cacheRemoveBean) {

        ApiResult apiResult = null;
        try {
            apiResult = ehcache3Service.cacheRemove(cacheRemoveBean);
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }

    /**
     * 校验 @CacheRemove 注解
     *
     * @param cacheRemoveBean
     * @return
     */
    @PostMapping(value = "cacheRemoveValidate")
    public ApiResult cacheRemoveValidate(@RequestBody CacheRemoveBean cacheRemoveBean) {

        ApiResult apiResult = null;
        try {
            apiResult = ehcache3Service.cacheRemoveValidate(cacheRemoveBean);
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }

    /**
     * 使用 @CacheRemoveAll 注解
     *
     * @param cacheRemoveAllBean
     * @return
     */
    @PostMapping(value = "cacheRemoveAll")
    public ApiResult cacheRemoveAll(@RequestBody CacheRemoveAllBean cacheRemoveAllBean) {

        ApiResult apiResult = null;
        try {
            apiResult = ehcache3Service.cacheRemoveAll(cacheRemoveAllBean);
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }

    /**
     * 校验 @CacheRemoveAll 注解
     *
     * @param cacheRemoveAllBean
     * @return
     */
    @PostMapping(value = "cacheRemoveAllValidate")
    public ApiResult cacheRemoveAllValidate(@RequestBody CacheRemoveAllBean cacheRemoveAllBean) {

        ApiResult apiResult = null;
        try {
            apiResult = ehcache3Service.cacheRemoveAllValidate(cacheRemoveAllBean);
        } catch (Exception e) {
            if (ParamsCheckException.class.isAssignableFrom(e.getClass())){
                log.error("参数错误");
                return apiResult.failure(ResponseCode.PARAM_ERROR.getCode(), e.getMessage());
            }
            log.error("未知异常",e);
            return apiResult.failure(ResponseCode.UNKNOWN_ERROR.getMsg());
        }

        return apiResult;
    }



}

package com.zht.cloud.controller;

import com.zht.cloud.entity.FndAccountInfo;
import com.zht.cloud.service.FndAccountInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 供应商账户信息(FndAccountInfo)表控制层
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@RestController
@RequestMapping("fndAccountInfo")
public class FndAccountInfoController {
    /**
     * 服务对象
     */
    @Resource
    private FndAccountInfoService fndAccountInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FndAccountInfo selectOne(Integer id) {
        return this.fndAccountInfoService.queryById(id);
    }

}
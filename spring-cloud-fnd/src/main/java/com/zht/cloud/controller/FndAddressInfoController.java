package com.zht.cloud.controller;

import com.zht.cloud.entity.FndAddressInfo;
import com.zht.cloud.service.FndAddressInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 供应商地址表(FndAddressInfo)表控制层
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@RestController
@RequestMapping("fndAddressInfo")
public class FndAddressInfoController {
    /**
     * 服务对象
     */
    @Resource
    private FndAddressInfoService fndAddressInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FndAddressInfo selectOne(Integer id) {
        return this.fndAddressInfoService.queryById(id);
    }

}
package com.zht.cloud.controller;

import com.zht.cloud.entity.FndContactInfo;
import com.zht.cloud.service.FndContactInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 供应商联系人表(FndContactInfo)表控制层
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@RestController
@RequestMapping("fndContactInfo")
public class FndContactInfoController {
    /**
     * 服务对象
     */
    @Resource
    private FndContactInfoService fndContactInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FndContactInfo selectOne(Integer id) {
        return this.fndContactInfoService.queryById(id);
    }

}
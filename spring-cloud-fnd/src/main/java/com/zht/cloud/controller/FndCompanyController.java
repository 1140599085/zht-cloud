package com.zht.cloud.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zht.cloud.domin.CommonResult;
import com.zht.cloud.entity.FndCompany;
import com.zht.cloud.service.FndCompanyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公司信息表(FndCompany)表控制层
 *
 * @author 张洪涛
 * @since 2020-06-04 15:54:56
 */
@RestController
@RequestMapping("fndCompany")
public class FndCompanyController {
    /**
     * 服务对象
     */
    @Resource
    private FndCompanyService fndCompanyService;


    @PostMapping
    public CommonResult insert(@RequestBody FndCompany fndCompany){
        FndCompany result = fndCompanyService.insert(fndCompany);
        if(result==null){
            return CommonResult.error(400,"添加失败");
        }
        return CommonResult.success("添加成功",result);
    }
    @PutMapping
    public CommonResult update(@RequestBody FndCompany fndCompany){
        if(fndCompany.getCompanyId()==null){
            return CommonResult.error(400,"供应商不存在，修改失败");
        }
        FndCompany result = fndCompanyService.update(fndCompany);
        return CommonResult.success("更新成功",result);
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CommonResult selectOne(Integer id) {
        FndCompany fndCompany = fndCompanyService.queryById(id);
        return CommonResult.success("查询成功",fndCompany);
    }
    @GetMapping("selectAll")
    public CommonResult selectAll(@RequestParam(value = "pageNum",defaultValue ="1") Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue ="10") Integer pageSize,
                                FndCompany fndCompany) {
        PageHelper.startPage(pageNum,pageSize);
        List<FndCompany> fndCompanies = fndCompanyService.queryAll(fndCompany);
        PageInfo<FndCompany> fndCompanyPageInfo = new PageInfo<>(fndCompanies);
        return CommonResult.success("查询成功",fndCompanyPageInfo);
    }
}
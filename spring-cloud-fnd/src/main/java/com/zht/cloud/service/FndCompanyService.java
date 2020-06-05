package com.zht.cloud.service;

import com.zht.cloud.entity.FndCompany;
import com.zht.cloud.entity.vo.FndCompanyVo;

import java.util.List;

/**
 * 公司信息表(FndCompany)表服务接口
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
public interface FndCompanyService {

    /**
     * 通过ID查询单条数据
     *
     * @param companyId 主键
     * @return 实例对象
     */
    FndCompany queryById(Integer companyId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param fndCompany 实例对象
     * @return 对象列表
     */
    List<FndCompany> queryAll(FndCompany fndCompany);
    /**
     * 新增数据
     *
     * @param fndCompany 实例对象
     * @return 实例对象
     */
    FndCompany insert(FndCompany fndCompany);

    /**
     * 修改数据
     *
     * @param fndCompany 实例对象
     * @return 实例对象
     */
    FndCompany update(FndCompany fndCompany);

    /**
     * 通过主键删除数据
     *
     * @param companyId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer companyId);

    /**
     * 通过ID查询单条数据
     *
     * @param companyId 主键
     * @return 实例对象
     */
    FndCompanyVo queryByCompanyId(Integer companyId);
}
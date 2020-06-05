package com.zht.cloud.service;

import com.zht.cloud.entity.FndAccountInfo;
import java.util.List;

/**
 * 供应商账户信息(FndAccountInfo)表服务接口
 *
 * @author makejava
 * @since 2020-06-04 15:54:53
 */
public interface FndAccountInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param accountId 主键
     * @return 实例对象
     */
    FndAccountInfo queryById(Integer accountId);
    /**
     * 通过ID查询单条数据
     *
     * @param companyCode
     * @return 实例对象
     */
    List<FndAccountInfo> queryByCompanyCode(String companyCode);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param fndAccountInfo 实例对象
     * @return 对象列表
     */
    List<FndAccountInfo> queryAll(FndAccountInfo fndAccountInfo);

    /**
     * 新增数据
     *
     * @param fndAccountInfo 实例对象
     * @return 实例对象
     */
    FndAccountInfo insert(FndAccountInfo fndAccountInfo);

    /**
     * 修改数据
     *
     * @param fndAccountInfo 实例对象
     * @return 实例对象
     */
    FndAccountInfo update(FndAccountInfo fndAccountInfo);

    /**
     * 通过主键删除数据
     *
     * @param accountId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer accountId);

}
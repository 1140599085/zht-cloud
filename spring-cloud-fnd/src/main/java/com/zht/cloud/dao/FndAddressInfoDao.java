package com.zht.cloud.dao;

import com.zht.cloud.entity.FndAddressInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 供应商地址表(FndAddressInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@Mapper
public interface FndAddressInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param addressId 主键
     * @return 实例对象
     */
    FndAddressInfo queryById(Integer addressId);
    /**
     * 通过ID查询单条数据
     *
     * @param companyCode
     * @return 实例对象
     */
    List<FndAddressInfo> queryByCompanyCode(String companyCode);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param fndAddressInfo 实例对象
     * @return 对象列表
     */
    List<FndAddressInfo> queryAll(FndAddressInfo fndAddressInfo);

    /**
     * 新增数据
     *
     * @param fndAddressInfo 实例对象
     * @return 影响行数
     */
    int insert(FndAddressInfo fndAddressInfo);

    /**
     * 修改数据
     *
     * @param fndAddressInfo 实例对象
     * @return 影响行数
     */
    int update(FndAddressInfo fndAddressInfo);

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 影响行数
     */
    int deleteById(Integer addressId);

}
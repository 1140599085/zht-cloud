package com.zht.cloud.dao;

import com.zht.cloud.entity.FndAccountInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 供应商账户信息(FndAccountInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-04 15:54:50
 */
@Mapper
public interface FndAccountInfoDao {

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
     * @return 影响行数
     */
    int insert(FndAccountInfo fndAccountInfo);

    /**
     * 修改数据
     *
     * @param fndAccountInfo 实例对象
     * @return 影响行数
     */
    int update(FndAccountInfo fndAccountInfo);

    /**
     * 通过主键删除数据
     *
     * @param accountId 主键
     * @return 影响行数
     */
    int deleteById(Integer accountId);

}
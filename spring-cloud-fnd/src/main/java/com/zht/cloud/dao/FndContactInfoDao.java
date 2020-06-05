package com.zht.cloud.dao;

import com.zht.cloud.entity.FndContactInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * 供应商联系人表(FndContactInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@Mapper
public interface FndContactInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param contactId 主键
     * @return 实例对象
     */
    FndContactInfo queryById(Integer contactId);
    /**
     * 通过ID查询单条数据
     *
     * @param companyCode
     * @return 实例对象
     */
    List<FndContactInfo> queryByCompanyCode(String companyCode);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param fndContactInfo 实例对象
     * @return 对象列表
     */
    List<FndContactInfo> queryAll(FndContactInfo fndContactInfo);

    /**
     * 新增数据
     *
     * @param fndContactInfo 实例对象
     * @return 影响行数
     */
    int insert(FndContactInfo fndContactInfo);

    /**
     * 修改数据
     *
     * @param fndContactInfo 实例对象
     * @return 影响行数
     */
    int update(FndContactInfo fndContactInfo);

    /**
     * 通过主键删除数据
     *
     * @param contactId 主键
     * @return 影响行数
     */
    int deleteById(Integer contactId);

}
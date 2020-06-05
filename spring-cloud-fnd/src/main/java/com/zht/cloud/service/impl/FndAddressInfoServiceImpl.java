package com.zht.cloud.service.impl;

import com.zht.cloud.entity.FndAddressInfo;
import com.zht.cloud.dao.FndAddressInfoDao;
import com.zht.cloud.service.FndAddressInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 供应商地址表(FndAddressInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@Service
public class FndAddressInfoServiceImpl implements FndAddressInfoService {
    @Resource
    private FndAddressInfoDao fndAddressInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param addressId 主键
     * @return 实例对象
     */
    @Override
    public FndAddressInfo queryById(Integer addressId) {
        return this.fndAddressInfoDao.queryById(addressId);
    }

    @Override
    public List<FndAddressInfo> queryByCompanyCode(String companyCode) {
        return fndAddressInfoDao.queryByCompanyCode(companyCode);
    }

    @Override
    public List<FndAddressInfo> queryAll(FndAddressInfo fndAddressInfo) {
        return fndAddressInfoDao.queryAll(fndAddressInfo);
    }


    /**
     * 新增数据
     *
     * @param fndAddressInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FndAddressInfo insert(FndAddressInfo fndAddressInfo) {
        this.fndAddressInfoDao.insert(fndAddressInfo);
        return fndAddressInfo;
    }

    /**
     * 修改数据
     *
     * @param fndAddressInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FndAddressInfo update(FndAddressInfo fndAddressInfo) {
        this.fndAddressInfoDao.update(fndAddressInfo);
        return this.queryById(fndAddressInfo.getAddressId());
    }

    /**
     * 通过主键删除数据
     *
     * @param addressId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer addressId) {
        return this.fndAddressInfoDao.deleteById(addressId) > 0;
    }
}
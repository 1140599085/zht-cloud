package com.zht.cloud.service.impl;

import com.zht.cloud.entity.FndAccountInfo;
import com.zht.cloud.dao.FndAccountInfoDao;
import com.zht.cloud.service.FndAccountInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 供应商账户信息(FndAccountInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-06-04 15:54:55
 */
@Service
public class FndAccountInfoServiceImpl implements FndAccountInfoService {
    @Resource
    private FndAccountInfoDao fndAccountInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param accountId 主键
     * @return 实例对象
     */
    @Override
    public FndAccountInfo queryById(Integer accountId) {
        return this.fndAccountInfoDao.queryById(accountId);
    }

    @Override
    public List<FndAccountInfo> queryAll(FndAccountInfo fndAccountInfo) {
        return fndAccountInfoDao.queryAll(fndAccountInfo);
    }


    /**
     * 新增数据
     *
     * @param fndAccountInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FndAccountInfo insert(FndAccountInfo fndAccountInfo) {
        this.fndAccountInfoDao.insert(fndAccountInfo);
        return fndAccountInfo;
    }

    /**
     * 修改数据
     *
     * @param fndAccountInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FndAccountInfo update(FndAccountInfo fndAccountInfo) {
        this.fndAccountInfoDao.update(fndAccountInfo);
        return this.queryById(fndAccountInfo.getAccountId());
    }

    /**
     * 通过主键删除数据
     *
     * @param accountId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer accountId) {
        return this.fndAccountInfoDao.deleteById(accountId) > 0;
    }
}
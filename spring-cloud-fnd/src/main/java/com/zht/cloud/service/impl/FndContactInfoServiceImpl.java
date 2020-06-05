package com.zht.cloud.service.impl;

import com.zht.cloud.entity.FndContactInfo;
import com.zht.cloud.dao.FndContactInfoDao;
import com.zht.cloud.service.FndContactInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 供应商联系人表(FndContactInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@Service
public class FndContactInfoServiceImpl implements FndContactInfoService {
    @Resource
    private FndContactInfoDao fndContactInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param contactId 主键
     * @return 实例对象
     */
    @Override
    public FndContactInfo queryById(Integer contactId) {
        return this.fndContactInfoDao.queryById(contactId);
    }

    @Override
    public List<FndContactInfo> queryByCompanyCode(String companyCode) {
        return fndContactInfoDao.queryByCompanyCode(companyCode);
    }


    @Override
    public List<FndContactInfo> queryAll(FndContactInfo fndContactInfo) {
        return fndContactInfoDao.queryAll(fndContactInfo);
    }


    /**
     * 新增数据
     *
     * @param fndContactInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FndContactInfo insert(FndContactInfo fndContactInfo) {
        this.fndContactInfoDao.insert(fndContactInfo);
        return fndContactInfo;
    }

    /**
     * 修改数据
     *
     * @param fndContactInfo 实例对象
     * @return 实例对象
     */
    @Override
    public FndContactInfo update(FndContactInfo fndContactInfo) {
        this.fndContactInfoDao.update(fndContactInfo);
        return this.queryById(fndContactInfo.getContactId());
    }

    /**
     * 通过主键删除数据
     *
     * @param contactId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer contactId) {
        return this.fndContactInfoDao.deleteById(contactId) > 0;
    }
}
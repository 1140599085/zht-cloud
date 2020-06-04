package com.zht.cloud.service.impl;

import com.zht.cloud.entity.FndCompany;
import com.zht.cloud.dao.FndCompanyDao;
import com.zht.cloud.service.FndCompanyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公司信息表(FndCompany)表服务实现类
 *
 * @author makejava
 * @since 2020-06-04 15:54:56
 */
@Service
public class FndCompanyServiceImpl implements FndCompanyService {
    @Resource
    private FndCompanyDao fndCompanyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param companyId 主键
     * @return 实例对象
     */
    @Override
    public FndCompany queryById(Integer companyId) {
        return this.fndCompanyDao.queryById(companyId);
    }

    @Override
    public List<FndCompany> queryAll(FndCompany fndCompany) {
        return fndCompanyDao.queryAll(fndCompany);
    }


    /**
     * 新增数据
     *
     * @param fndCompany 实例对象
     * @return 实例对象
     */
    @Override
    public FndCompany insert(FndCompany fndCompany) {
        this.fndCompanyDao.insert(fndCompany);
        return fndCompany;
    }

    /**
     * 修改数据
     *
     * @param fndCompany 实例对象
     * @return 实例对象
     */
    @Override
    public FndCompany update(FndCompany fndCompany) {
        this.fndCompanyDao.update(fndCompany);
        return this.queryById(fndCompany.getCompanyId());
    }

    /**
     * 通过主键删除数据
     *
     * @param companyId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer companyId) {
        return this.fndCompanyDao.deleteById(companyId) > 0;
    }
}
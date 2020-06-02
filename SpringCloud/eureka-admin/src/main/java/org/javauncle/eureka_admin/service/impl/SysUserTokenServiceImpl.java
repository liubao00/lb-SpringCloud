package org.javauncle.eureka_admin.service.impl;

import org.javauncle.eureka_admin.entity.SysUserToken;
import org.javauncle.eureka_admin.dao.SysUserTokenDao;
import org.javauncle.eureka_admin.service.SysUserTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUserToken)表服务实现类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@Service("sysUserTokenService")
public class SysUserTokenServiceImpl implements SysUserTokenService {
    @Resource
    private SysUserTokenDao sysUserTokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUserToken queryById(Long id) {
        return this.sysUserTokenDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUserToken> queryAllByLimit(int offset, int limit) {
        return this.sysUserTokenDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUserToken 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserToken insert(SysUserToken sysUserToken) {
        this.sysUserTokenDao.insert(sysUserToken);
        return sysUserToken;
    }

    /**
     * 修改数据
     *
     * @param sysUserToken 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserToken update(SysUserToken sysUserToken) {
        this.sysUserTokenDao.update(sysUserToken);
        return this.queryById(sysUserToken.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysUserTokenDao.deleteById(id) > 0;
    }
}
package org.javauncle.eureka_admin.service.impl;

import org.javauncle.eureka_admin.entity.SysDict;
import org.javauncle.eureka_admin.dao.SysDictDao;
import org.javauncle.eureka_admin.service.SysDictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysDict)表服务实现类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@Service("sysDictService")
public class SysDictServiceImpl implements SysDictService {
    @Resource
    private SysDictDao sysDictDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysDict queryById(Long id) {
        return this.sysDictDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysDict> queryAllByLimit(int offset, int limit) {
        return this.sysDictDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysDict 实例对象
     * @return 实例对象
     */
    @Override
    public SysDict insert(SysDict sysDict) {
        this.sysDictDao.insert(sysDict);
        return sysDict;
    }

    /**
     * 修改数据
     *
     * @param sysDict 实例对象
     * @return 实例对象
     */
    @Override
    public SysDict update(SysDict sysDict) {
        this.sysDictDao.update(sysDict);
        return this.queryById(sysDict.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysDictDao.deleteById(id) > 0;
    }
}
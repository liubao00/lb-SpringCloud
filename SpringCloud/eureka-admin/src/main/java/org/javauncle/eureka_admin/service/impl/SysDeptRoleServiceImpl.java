package org.javauncle.eureka_admin.service.impl;

import org.javauncle.eureka_admin.entity.SysDeptRole;
import org.javauncle.eureka_admin.dao.SysDeptRoleDao;
import org.javauncle.eureka_admin.service.SysDeptRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysDeptRole)表服务实现类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@Service("sysDeptRoleService")
public class SysDeptRoleServiceImpl implements SysDeptRoleService {
    @Resource
    private SysDeptRoleDao sysDeptRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysDeptRole queryById(Long id) {
        return this.sysDeptRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysDeptRole> queryAllByLimit(int offset, int limit) {
        return this.sysDeptRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysDeptRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysDeptRole insert(SysDeptRole sysDeptRole) {
        this.sysDeptRoleDao.insert(sysDeptRole);
        return sysDeptRole;
    }

    /**
     * 修改数据
     *
     * @param sysDeptRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysDeptRole update(SysDeptRole sysDeptRole) {
        this.sysDeptRoleDao.update(sysDeptRole);
        return this.queryById(sysDeptRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysDeptRoleDao.deleteById(id) > 0;
    }
}
package org.javauncle.eureka_admin.service.impl;

import org.javauncle.eureka_admin.constants.SysConstants;
import org.javauncle.eureka_admin.entity.SysMenu;
import org.javauncle.eureka_admin.dao.SysMenuDao;
import org.javauncle.eureka_admin.service.SysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysMenu)表服务实现类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    @Resource
    private SysMenuDao sysMenuDao;

    /**
     * 根据用户名查找菜单
     * @param username
     * @return
     */
    @Override
    public List<SysMenu> findByUserName(String username) {
        if(username == null || "".equals(username) || SysConstants.ADMIN.equals(username)){
            return sysMenuDao.findAll();
        }
        return sysMenuDao.findByUserName(username);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysMenu queryById(Long id) {
        return this.sysMenuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysMenu> queryAllByLimit(int offset, int limit) {
        return this.sysMenuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenu insert(SysMenu sysMenu) {
        this.sysMenuDao.insert(sysMenu);
        return sysMenu;
    }

    /**
     * 修改数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenu update(SysMenu sysMenu) {
        this.sysMenuDao.update(sysMenu);
        return this.queryById(sysMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysMenuDao.deleteById(id) > 0;
    }
}
package org.javauncle.eureka_admin.service.impl;

import org.javauncle.eureka_admin.dao.SysMenuDao;
import org.javauncle.eureka_admin.entity.SysMenu;
import org.javauncle.eureka_admin.entity.SysUser;
import org.javauncle.eureka_admin.dao.SysUserDao;
import org.javauncle.eureka_admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * (SysUser)表服务实现类
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    @Resource
    private SysMenuDao sysMenuDao;
    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    @Override
    public SysUser findByName(String username) {
        return this.sysUserDao.findByName(username);
    }

    /**
     * 查询用户的菜单权限标识集合
     * @param username
     * @return
     */
    @Override
    public Set<String> findPermissions(String username) {
        Set<String> perms = new HashSet<String>();
        List<SysMenu> sysMenus = sysMenuDao.findByUserName(username);
        for (SysMenu sysMenu: sysMenus) {
            if (sysMenu.getPerms() != null && "".equals(sysMenu.getPerms())) {
                perms.add(sysMenu.getPerms());
            }
        }
        return perms;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(Long id) {
        return this.sysUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUser> queryAllByLimit(int offset, int limit) {
        return this.sysUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserDao.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUserDao.update(sysUser);
        return this.queryById(sysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.sysUserDao.deleteById(id) > 0;
    }

    /**
     * 查询全部数据
     * @param sysUser
     * @return
     */
    @Override
    public List<SysUser> queryAll(SysUser sysUser) {
        return this.sysUserDao.queryAll(sysUser);
    }
}
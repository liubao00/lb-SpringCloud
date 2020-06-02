package org.javauncle.eureka_admin.service;

import org.javauncle.eureka_admin.entity.SysUser;
import java.util.List;
import java.util.Set;

/**
 * (SysUser)表服务接口
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public interface SysUserService {

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    SysUser findByName(String username);

    /**
     * 查询用户的菜单权限标识集合
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser insert(SysUser sysUser);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 查询全部用户
     * @param sysUser
     * @return
     */
    List<SysUser> queryAll(SysUser sysUser);
}
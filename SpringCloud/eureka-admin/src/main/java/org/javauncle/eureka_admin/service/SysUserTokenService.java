package org.javauncle.eureka_admin.service;

import org.javauncle.eureka_admin.entity.SysUserToken;
import java.util.List;

/**
 * (SysUserToken)表服务接口
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public interface SysUserTokenService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserToken queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUserToken> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUserToken 实例对象
     * @return 实例对象
     */
    SysUserToken insert(SysUserToken sysUserToken);

    /**
     * 修改数据
     *
     * @param sysUserToken 实例对象
     * @return 实例对象
     */
    SysUserToken update(SysUserToken sysUserToken);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
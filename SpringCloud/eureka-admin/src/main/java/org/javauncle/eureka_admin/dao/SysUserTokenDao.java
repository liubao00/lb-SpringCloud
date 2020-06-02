package org.javauncle.eureka_admin.dao;

import org.javauncle.eureka_admin.entity.SysUserToken;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysUserToken)表数据库访问层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public interface SysUserTokenDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserToken queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUserToken> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysUserToken 实例对象
     * @return 对象列表
     */
    List<SysUserToken> queryAll(SysUserToken sysUserToken);

    /**
     * 新增数据
     *
     * @param sysUserToken 实例对象
     * @return 影响行数
     */
    int insert(SysUserToken sysUserToken);

    /**
     * 修改数据
     *
     * @param sysUserToken 实例对象
     * @return 影响行数
     */
    int update(SysUserToken sysUserToken);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
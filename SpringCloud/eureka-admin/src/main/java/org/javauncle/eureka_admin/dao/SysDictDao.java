package org.javauncle.eureka_admin.dao;

import org.javauncle.eureka_admin.entity.SysDict;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysDict)表数据库访问层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public interface SysDictDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysDict queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysDict> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysDict 实例对象
     * @return 对象列表
     */
    List<SysDict> queryAll(SysDict sysDict);

    /**
     * 新增数据
     *
     * @param sysDict 实例对象
     * @return 影响行数
     */
    int insert(SysDict sysDict);

    /**
     * 修改数据
     *
     * @param sysDict 实例对象
     * @return 影响行数
     */
    int update(SysDict sysDict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}
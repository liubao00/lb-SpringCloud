package org.javauncle.eureka_admin.service;

import org.javauncle.eureka_admin.entity.SysDict;
import java.util.List;

/**
 * (SysDict)表服务接口
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public interface SysDictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysDict queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysDict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysDict 实例对象
     * @return 实例对象
     */
    SysDict insert(SysDict sysDict);

    /**
     * 修改数据
     *
     * @param sysDict 实例对象
     * @return 实例对象
     */
    SysDict update(SysDict sysDict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
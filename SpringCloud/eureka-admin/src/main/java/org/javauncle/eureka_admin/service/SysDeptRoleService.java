package org.javauncle.eureka_admin.service;

import org.javauncle.eureka_admin.entity.SysDeptRole;
import java.util.List;

/**
 * (SysDeptRole)表服务接口
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
public interface SysDeptRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysDeptRole queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysDeptRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysDeptRole 实例对象
     * @return 实例对象
     */
    SysDeptRole insert(SysDeptRole sysDeptRole);

    /**
     * 修改数据
     *
     * @param sysDeptRole 实例对象
     * @return 实例对象
     */
    SysDeptRole update(SysDeptRole sysDeptRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
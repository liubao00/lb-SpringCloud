package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysDeptRole;
import org.javauncle.eureka_admin.service.SysDeptRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysDeptRole)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysDeptRole")
public class SysDeptRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysDeptRoleService sysDeptRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDeptRole selectOne(Long id) {
        return this.sysDeptRoleService.queryById(id);
    }

}
package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysUserRole;
import org.javauncle.eureka_admin.service.SysUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysUserRole)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysUserRole")
public class SysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserRoleService sysUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserRole selectOne(Long id) {
        return this.sysUserRoleService.queryById(id);
    }

}
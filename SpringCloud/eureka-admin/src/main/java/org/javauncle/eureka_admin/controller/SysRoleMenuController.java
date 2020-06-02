package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysRoleMenu;
import org.javauncle.eureka_admin.service.SysRoleMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysRoleMenu)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysRoleMenu")
public class SysRoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleMenuService sysRoleMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoleMenu selectOne(Long id) {
        return this.sysRoleMenuService.queryById(id);
    }

}
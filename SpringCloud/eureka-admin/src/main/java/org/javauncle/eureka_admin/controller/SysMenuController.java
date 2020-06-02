package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysMenu;
import org.javauncle.eureka_admin.service.SysMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysMenu)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysMenu")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysMenuService sysMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMenu selectOne(Long id) {
        return this.sysMenuService.queryById(id);
    }

}
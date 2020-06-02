package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysUser;
import org.javauncle.eureka_admin.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import java.util.List;

/**
 * (SysUser)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(Long id) {
        return this.sysUserService.queryById(id);
    }

    /**
     * 新增用户
     * @param sysUser
     * @return
     */
    @PostMapping("insert")
    public SysUser insert(SysUser sysUser) {
        return this.sysUserService.insert(sysUser);
    }

    /**
     * 查询全部用户
     * @param sysUser
     * @return
     */
    @PostMapping("queryAll")
    public List<SysUser> queryAll(SysUser sysUser) {
        return this.sysUserService.queryAll(sysUser);
    }
}
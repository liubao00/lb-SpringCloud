package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysUserToken;
import org.javauncle.eureka_admin.service.SysUserTokenService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysUserToken)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysUserToken")
public class SysUserTokenController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserTokenService sysUserTokenService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUserToken selectOne(Long id) {
        return this.sysUserTokenService.queryById(id);
    }

}
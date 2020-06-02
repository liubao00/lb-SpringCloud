package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysDict;
import org.javauncle.eureka_admin.service.SysDictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysDict)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysDict")
public class SysDictController {
    /**
     * 服务对象
     */
    @Resource
    private SysDictService sysDictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDict selectOne(Long id) {
        return this.sysDictService.queryById(id);
    }

}
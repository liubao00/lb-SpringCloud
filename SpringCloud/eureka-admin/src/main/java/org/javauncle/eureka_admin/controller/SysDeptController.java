package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysDept;
import org.javauncle.eureka_admin.service.SysDeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysDept)表控制层
 *
 * @author liubao
 * @since 2020-05-28 16:13:44
 */
@RestController
@RequestMapping("sysDept")
public class SysDeptController {
    /**
     * 服务对象
     */
    @Resource
    private SysDeptService sysDeptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDept selectOne(Long id) {
        return this.sysDeptService.queryById(id);
    }

}
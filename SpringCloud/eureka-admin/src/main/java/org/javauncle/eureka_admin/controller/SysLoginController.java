package org.javauncle.eureka_admin.controller;

import org.javauncle.eureka_admin.entity.SysUser;
import org.javauncle.eureka_admin.http.HttpResult;
import org.javauncle.eureka_admin.security.JwtAuthenticationToken;
import org.javauncle.eureka_admin.service.SysUserService;
import org.javauncle.eureka_admin.util.PasswordUtils;
import org.javauncle.eureka_admin.util.SecurityUtils;
import org.javauncle.eureka_admin.vo.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * 登录控制器
 * @Author liubao
 * @Date 2020/5/29
 */
@RestController
public class SysLoginController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private AuthenticationManager authenticationManager;
    /**
     *
     * @return
     */
    @PostMapping("/login")
    public HttpResult login(@RequestBody LoginBean loginBean, HttpServletRequest request) {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

        System.out.println(username + "===============>" + password);
        SysUser sysUser = sysUserService.findByName(username);

        if(sysUser == null) {
            return HttpResult.error("账户不存在");
        }
        if(!PasswordUtils.matches(sysUser.getSalt(), password, sysUser.getPassword())) {
            return HttpResult.error("密码不正确");
        }

        //账号是否被锁定
        if(sysUser.getState() == 0) {
            HttpResult.error("账号被锁定，请联系管理员");
        }

        // 系统登录认证
        try{
            JwtAuthenticationToken token = SecurityUtils.login(request, username, password, authenticationManager);
            System.out.println(token + "token");
        }catch (Exception e) {
            e.printStackTrace();
        }

        // 返回 token
        return HttpResult.ok();
    }
}

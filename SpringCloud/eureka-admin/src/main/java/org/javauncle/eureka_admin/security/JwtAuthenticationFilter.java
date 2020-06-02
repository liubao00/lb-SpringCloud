package org.javauncle.eureka_admin.security;

import org.javauncle.eureka_admin.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录认证过滤器
 * @Author liubao
 * @Date 2020/5/29
 */
public class JwtAuthenticationFilter extends BasicAuthenticationFilter {

    @Autowired
    public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    /**
     *  过滤器拦截请求，获取token，检查用户信息
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 获取token，并检查登录状态
        SecurityUtils.checkAuthentication(request);
        chain.doFilter(request, response);
    }
}

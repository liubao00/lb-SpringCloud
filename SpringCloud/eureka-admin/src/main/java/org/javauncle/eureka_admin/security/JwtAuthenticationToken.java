package org.javauncle.eureka_admin.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * 自定义令牌对象(用来存储token信息)
 * @Author liubao
 * Date 2020/5/29
 */
public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {

    private static final long serialVersionUID = 1L;

    private String token;


    public JwtAuthenticationToken(Object principal, Object credentials) {
        super(principal, credentials);
    }

    // 方法重载 参数多个token
    public JwtAuthenticationToken(Object principal, Object credentials, String token) {
        super(principal, credentials);
        this.token = token;
    }
    // 方法重载 参数多个token
    public JwtAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities, String token) {
        super(principal, credentials, authorities);
        this.token = token;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

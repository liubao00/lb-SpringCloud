package org.javauncle.eureka_admin.security;

import org.javauncle.eureka_admin.util.PasswordEncoder;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 身份验证提供者（自定义身份认证组件）
 * @Author liubao
 * @Date 2020/5/28
 */
public class JwtAuthenticationProvider extends DaoAuthenticationProvider {


    /**
     * 自己的定义的身份验证
     * @param userDetailsService
     */
    public JwtAuthenticationProvider(UserDetailsService userDetailsService){
        setUserDetailsService(userDetailsService);
    }

    /**
     * 身份验证的检查
     * @param userDetails
     * @param authentication
     * @throws AuthenticationException
     */
    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        if(authentication.getCredentials() == null){
            logger.debug("Authentication failed: no credentials provided");
            throw new BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials","Bad credentials"));
        }
        String password = authentication.getCredentials().toString();
        String salt = ((JwtUserDetails) userDetails).getSalt();
        // 密码校验逻辑
        if(!new PasswordEncoder(salt).matches(userDetails.getPassword(), password)) {
            logger.debug("Authentication failed: password does not match stored value");
            throw new BadCredentialsException(messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
        }
    }
}

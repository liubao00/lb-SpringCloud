package org.javauncle.eureka_admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 设置白名单
 * @Author liubao
 * @Date 2020/5/28
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 允许跨域的路径
                .allowedOrigins("*") //允许跨域的访问的源
                .allowedMethods("POST","GET","OPTIONS","DELETE")// 允许请求方法
                .maxAge(16800) //预检 间隔时间
                .allowedHeaders("*")// 允许头部设置
                .allowCredentials(true);//是否发送Cookie
    }
}

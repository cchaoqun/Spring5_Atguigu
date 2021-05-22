package com.AtGuiGu.Spring6_Annotation.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chaoqun Cheng
 * @date 2021-04-2021/4/24-20:35
 */

@Configuration//作为配置类, 替代xml配置文件
//替代<context:component-scan base-package="com.AtGuiGu.Spring6_Annotation"></context:component-scan>
@ComponentScan(basePackages={"com.AtGuiGu.Spring6_Annotation"})
public class SpringConfig {
}

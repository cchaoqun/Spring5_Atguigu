package com.AtGuiGu.Spring8_AOP_AspectJ.Annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-20:03
 */

@Configuration
@ComponentScan(basePackages = {"com.AtGuiGu.Spring8_AOP_AspectJ.Annotation"}) //开启组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true) // 开启Aspect生成代理对象
public class ConfigAop {
}

package com.fish.springboot.web.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: Jayzou
 * @Date: 2019/2/1
 */
@Configuration
@EnableConfigurationProperties(AcmeProperties.class)
public class CustomConifg {
}

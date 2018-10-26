package com.jedijava.home.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 测试环境配置
 * @author liukaiyang
 * @date 2018/10/26 17:22
 */
@Configuration
@Profile("dev")
@Getter
public class DevelopConfiguration {

}

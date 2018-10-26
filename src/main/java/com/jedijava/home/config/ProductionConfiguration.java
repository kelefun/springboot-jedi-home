package com.jedijava.home.config;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 生产环境配置
 * @author liukaiyang
 * @date 2018/10/26 17:22
 */
@Configuration
@Profile("production")
@Getter
public class ProductionConfiguration {

}

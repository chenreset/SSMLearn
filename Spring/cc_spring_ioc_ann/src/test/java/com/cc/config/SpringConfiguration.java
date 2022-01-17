package com.cc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.cc")
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}

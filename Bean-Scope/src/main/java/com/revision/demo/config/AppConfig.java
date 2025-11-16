package com.revision.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration()
@ComponentScan( basePackages = "com.revision.demo")//,lazyInit = true)
//@ComponentScan( basePackages = "com.revision.demo",lazyInit = true)
public class AppConfig {
}

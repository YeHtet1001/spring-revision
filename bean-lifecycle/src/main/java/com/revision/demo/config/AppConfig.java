package com.revision.demo.config;

import com.revision.demo.beans.SpringBean1;
import com.revision.demo.custombean.CustomBeanPostProcessor;
import com.revision.demo.custombeanfactory.CustomBeanFactoryPostProcessor;
import com.revision.myapp.SpringBean2;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan//to find bean objects
@Configuration//to configure bean objects
public class AppConfig {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor (){

        return new CustomBeanFactoryPostProcessor();

    }

    @Bean
    public static BeanPostProcessor beanPostProcessor(){

        return new CustomBeanPostProcessor();

    }

    @Bean( initMethod = "customInit",destroyMethod = "customDestroy")
    public SpringBean1 springBean1(){

        return new SpringBean1();

    }

    @Bean
    public SpringBean2 springBean2(){

        return new SpringBean2();

    }

}

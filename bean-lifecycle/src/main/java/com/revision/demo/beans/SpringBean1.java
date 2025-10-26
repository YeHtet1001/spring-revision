package com.revision.demo.beans;

import com.revision.myapp.SpringBean2;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean1 implements InitializingBean, DisposableBean {


    private SpringBean2 springBean2;

    public SpringBean1() {

        System.out.println("SpringBean1 constructor");

    }

    @PostConstruct
    public void postConstruct() {

        System.out.println("SpringBean1 postConstruct");

    }

    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {

        System.out.println("SpringBean2 setter to :: " + this.getClass().getSimpleName() );
        this.springBean2 = springBean2;

    }


    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("SpringBean1 afterPropertiesSet :: " + this.getClass().getSimpleName() );

    }

    public void customInit(){

        System.out.println( this.getClass().getSimpleName() + ":: customInit");

    }

    public void sayHello(){

        System.out.println( this.getClass().getSimpleName() + "say Hello !!!!");

    }

    @PreDestroy
    public void preDestroy(){

        System.out.println( this.getClass().getSimpleName() + "preDestroy");

    }


    @Override
    public void destroy() throws Exception {

        System.out.println( this.getClass().getSimpleName() + "destroy");

    }

    public void customDestroy(){

        System.out.println( this.getClass().getSimpleName() + "customDestroy");

    }

}

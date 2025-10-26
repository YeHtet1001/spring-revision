package com.revision.demo.custombeanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println("Starting: CustomBeanFactoryPostProcessor=> BeanFactoryPostProcessor");

        beanFactory.getBeanNamesIterator().forEachRemaining(System.out::println);
//        Iterator<String> iter = beanFactory.getBeanNamesIterator();
//
//        while ( iter.hasNext() ) {
//
//            String beanName = iter.next();
//            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
//            System.out.println(beanDefinition);
//
//        }

        System.out.println("Ending: CustomBeanFactoryPostProcessor=> BeanFactoryPostProcessor");

    }

}

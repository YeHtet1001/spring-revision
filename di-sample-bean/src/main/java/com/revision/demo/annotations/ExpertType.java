package com.revision.demo.annotations;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD,ElementType.CONSTRUCTOR})
@Qualifier
public @interface ExpertType {

    enum Type{
        java,
        py
    }
    Type value() default Type.java;

}

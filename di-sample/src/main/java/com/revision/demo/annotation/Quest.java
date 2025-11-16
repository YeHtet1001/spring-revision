package com.revision.demo.annotation;

import lombok.Builder;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Qualifier
public @interface Quest {

    enum QuestType {

        Kill_Dragon, Rescuing,Sing

    }

    QuestType questType() default QuestType.Rescuing;

}

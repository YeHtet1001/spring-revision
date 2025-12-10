package com.revision.demo.no_aop.logger;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@Scope("prototype")//safe for multi-thread
public class PerformLogger {
    private static final Logger log = LoggerFactory.getLogger(PerformLogger.class);
    @Data
    public static class  PerformanceLoggerInfo{


        private String methodName;
        private long startTime;

        public PerformanceLoggerInfo(String methodName, long startTime) {
            this.methodName = methodName;
            this.startTime = startTime;
        }
    }

    public PerformanceLoggerInfo getStatTimeForMethod(String methodName) {

        long startTime = System.currentTimeMillis();

        PerformanceLoggerInfo info = new PerformanceLoggerInfo(methodName, startTime);

        return info;

    }

    public void getEndTime(PerformanceLoggerInfo info) {
        long endTime = System.currentTimeMillis();

        long startTime = info.getStartTime();
        long duration = endTime - startTime;
        System.out.println("%s method take time %s".formatted(info.getMethodName(), Duration.ofMillis(duration)));

        log.info("Method {} executed in {}", info.getMethodName(), Duration.ofMillis(duration));

    }



}

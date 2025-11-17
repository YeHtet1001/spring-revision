package com.revision.demo.loggerdemo01.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private static final Logger log = LoggerFactory.getLogger(MathService.class);

    public int divide(int a, int b) {

        try{
            int result = a / b;
            log.info("Successfully divided {} by {}. Result: {}", a, b, result);
            return result;
        }
        catch(ArithmeticException err){
            log.error("Division failed for {} / {}: {}", a, b, err.getMessage(), err);
            throw err;
        }

    }

}

package com.revision.demo.loggerdemo01.controllers;

import com.revision.demo.loggerdemo01.services.MathService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private static final Logger log = LoggerFactory.getLogger(MathController.class);
    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int a, @RequestParam int b) {

        int result = mathService.divide(a, b);
        return "divide result: " + result;

    }

}

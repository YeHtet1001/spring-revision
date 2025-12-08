package com.revision.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Model1 {

    @Value("${my.model.name}")
    private String modelName;

    @Value("${tax.income}")
    private int tax;

}

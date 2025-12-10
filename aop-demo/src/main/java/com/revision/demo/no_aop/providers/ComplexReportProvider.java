package com.revision.demo.no_aop.providers;

import com.revision.demo.no_aop.entity.Report;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportProvider {

    public Report getReport()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ComplexReportProvider :: getReport");
        return new Report();

    }

}

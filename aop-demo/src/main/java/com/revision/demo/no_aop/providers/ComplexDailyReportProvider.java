package com.revision.demo.no_aop.providers;

import com.revision.demo.no_aop.entity.DailyReport;
import org.springframework.stereotype.Component;

@Component
public class ComplexDailyReportProvider {

    public DailyReport getDailyReport() {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ComplexDailyReportProvider :: getDailyReport");
        return new DailyReport();

    }

}

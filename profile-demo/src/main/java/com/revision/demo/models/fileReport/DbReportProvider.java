package com.revision.demo.models.fileReport;

import com.revision.demo.models.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("db")
public class DbReportProvider implements ReportInterface {

    @Override
    public Report getFileReport() {
        System.out.println("DBReportProvider's getFileReport");
        return new Report();
    }

}

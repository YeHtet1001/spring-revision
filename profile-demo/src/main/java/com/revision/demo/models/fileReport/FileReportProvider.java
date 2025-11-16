package com.revision.demo.models.fileReport;

import com.revision.demo.models.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("file")
public class FileReportProvider implements ReportInterface {

    @Override
    public Report getFileReport() {
        System.out.println("FileReportProvider's getFileReport");
        return new Report();
    }


}

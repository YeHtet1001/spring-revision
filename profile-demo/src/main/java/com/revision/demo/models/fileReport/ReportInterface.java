package com.revision.demo.models.fileReport;

import com.revision.demo.models.Report;
import org.springframework.stereotype.Component;

@Component
public interface ReportInterface {

    Report getFileReport();


}

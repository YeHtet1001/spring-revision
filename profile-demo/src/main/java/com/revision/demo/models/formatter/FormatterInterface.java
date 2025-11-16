package com.revision.demo.models.formatter;

import com.revision.demo.models.FormattedReport;
import com.revision.demo.models.Report;
import org.springframework.stereotype.Component;

@Component
public interface FormatterInterface {

    FormattedReport formatReport(Report report);

}

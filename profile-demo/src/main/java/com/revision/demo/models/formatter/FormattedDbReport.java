package com.revision.demo.models.formatter;

import com.revision.demo.models.FormattedReport;
import com.revision.demo.models.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("db")
public class FormattedDbReport implements FormatterInterface{
    @Override
    public FormattedReport formatReport(Report report) {

        System.out.println("FormattedDBbReport's formattedReport");
        return new FormattedReport();

    }
}

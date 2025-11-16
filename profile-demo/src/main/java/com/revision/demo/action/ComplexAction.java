package com.revision.demo.action;

import com.revision.demo.models.FormattedReport;
import com.revision.demo.models.Report;
import com.revision.demo.models.fileReport.ReportInterface;
import com.revision.demo.models.formatter.FormatterInterface;
import com.revision.demo.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComplexAction {

    private final ReportRepository reportRepository;
    private final ReportInterface reportInterface;
    private final FormatterInterface formatterInterface;


//    public ComplexAction(ReportRepository reportRepository, ReportInterface reportInterface, FormatterInterface formatterInterface) {
//        this.reportRepository = reportRepository;
//        this.reportInterface = reportInterface;
//        this.formatterInterface = formatterInterface;
//    }

    public Report createAction(){

        //simulation
        Report report = reportInterface.getFileReport();
        FormattedReport formattedReport = formatterInterface.formatReport(report);
        reportRepository.saveReport(report);

        return report;

    }

}

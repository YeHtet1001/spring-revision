package com.revision.demo.no_aop.action;

import com.revision.demo.no_aop.entity.DailyReport;
import com.revision.demo.no_aop.entity.Report;
import com.revision.demo.no_aop.logger.PerformLogger;
import com.revision.demo.no_aop.providers.ComplexDailyReportProvider;
import com.revision.demo.no_aop.providers.ComplexReportProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import static com.revision.demo.no_aop.logger.PerformLogger.PerformanceLoggerInfo;

@Slf4j
@Component
@RequiredArgsConstructor
public class ComplexAction {

    private final ComplexReportProvider reportProvider;
    private final ComplexDailyReportProvider dailyReportProvider;

    public void doAction() {

        PerformLogger performLogger = new PerformLogger();
        PerformanceLoggerInfo info = performLogger.getStatTimeForMethod("reportProvider.getReport()");
        Report report = reportProvider.getReport();
        performLogger.getEndTime(info);

        PerformLogger performLogger2 = new PerformLogger();
        PerformanceLoggerInfo info2 = performLogger2.getStatTimeForMethod("dailyReportProvider.getDailyReport()");
        DailyReport dailyReport = dailyReportProvider.getDailyReport();
        performLogger2.getEndTime(info2);


    }

}

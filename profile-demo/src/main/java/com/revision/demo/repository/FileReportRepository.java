package com.revision.demo.repository;

import com.revision.demo.models.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository @Profile("file")
public class FileReportRepository implements ReportRepository {

    @Override
    public void saveReport(Report report) {

        System.out.println("FileReportRepository's saveReport!!!!!");

    }

}

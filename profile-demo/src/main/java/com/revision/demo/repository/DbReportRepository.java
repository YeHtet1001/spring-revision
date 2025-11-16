package com.revision.demo.repository;

import com.revision.demo.models.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository @Profile("db")
public class DbReportRepository implements ReportRepository {

    @Override
    public void saveReport(Report report) {

        System.out.println("DbReportRepository's saveReport!!!!!");

    }

}

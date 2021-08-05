package com.epam.olha_yeskina.java.lecture_7.task_1;

public enum Courses {
    JavaServletTechnology(16),
    StrutsFramework(24),
    JavaTechnologyOverview(8),
    JFCSwinglibrary(16),
    JDBCTechnology(16);

    int hours;
    Courses(int hours) {
        this.hours = hours;
    }
}

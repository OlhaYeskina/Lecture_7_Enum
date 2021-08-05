package com.epam.olha_yeskina.java.lecture_7.task_1;

public class Student {

    private String studentName;
    private String curriculum;
    private String startingDate;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public Student(String studentName, String curriculum, String startingDate) {
        this.studentName = studentName;
        this.curriculum = curriculum;
        this.startingDate = startingDate;
    }


}

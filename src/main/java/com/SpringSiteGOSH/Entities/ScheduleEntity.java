package com.SpringSiteGOSH.Entities;

import javax.persistence.*;

@Entity
@Table(name = "f_fit")
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int subject;

    @Column(length = 60)
    private int groupofstudent;

    @Column(length = 60)
    private int courseofstudent;

    @Column(length = 60)
    private String monday;

    @Column(length = 60)
    private String tuesday;

    @Column(length = 60)
    private String wednesday;

    @Column(length = 60)
    private String thursday;

    @Column(length = 60)
    private String friday;

    @Column(length = 60)
    private String monday2;

    @Column(length = 60)
    private String tuesday2;

    @Column(length = 60)
    private String wednesday2;

    @Column(length = 60)
    private String thursday2;

    @Column(length = 60)
    private String friday2;

    @Column(length = 60)
    private String time;

    public String getTime() {
        return time;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public int getGroupofstudent() {
        return groupofstudent;
    }

    public void setGroupofstudent(int groupofstudent) {
        this.groupofstudent = groupofstudent;
    }

    public int getCourseofstudent() {
        return courseofstudent;
    }

    public void setCourseofstudent(int courseofstudent) {
        this.courseofstudent = courseofstudent;
    }

    public String getMonday2() {
        return monday2;
    }

    public void setMonday2(String monday2) {
        this.monday2 = monday2;
    }

    public String getTuesday2() {
        return tuesday2;
    }

    public void setTuesday2(String tuesday2) {
        this.tuesday2 = tuesday2;
    }

    public String getWednesday2() {
        return wednesday2;
    }

    public void setWednesday2(String wednesday2) {
        this.wednesday2 = wednesday2;
    }

    public String getThursday2() {
        return thursday2;
    }

    public void setThursday2(String thursday2) {
        this.thursday2 = thursday2;
    }

    public String getFriday2() {
        return friday2;
    }

    public void setFriday2(String friday2) {
        this.friday2 = friday2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }
}

package com.SpringSiteGOSH.DatabaseSubjects;

import javax.persistence.*;

@Entity
@Table(name = "f_fit_c2g8")
public class f_fit_c2g8 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_f_fit_c2g8;

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

    public Long getId_c2g9() {
        return id_f_fit_c2g8;
    }

    public void setId_c2g9(Long id_f_fit_c2g8) {
        this.id_f_fit_c2g8 = id_f_fit_c2g8;
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

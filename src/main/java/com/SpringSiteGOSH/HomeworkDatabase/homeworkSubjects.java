package com.SpringSiteGOSH.HomeworkDatabase;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "subjectshome")
public class homeworkSubjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String subject;

    @Column(length = 60)
    private int groupofstudent;

    @Column(length = 60)
    private int courseofstudent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
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
}

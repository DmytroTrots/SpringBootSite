package com.SpringSiteGOSH.HomeworkDatabase;

import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.Date;

@Component
@Entity
@Table(name = "homework_add")
public class homeworkAddDatabase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String task;

    @Column
    private String deadline;

    @Column
    private String subject;

    @Column
    private String login;

    public homeworkAddDatabase(String subject, String task, String deadline,  String login) {
        this.task = task;
        this.deadline = deadline;
        this.subject = subject;
        this.login = login;
    }

    public homeworkAddDatabase() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}

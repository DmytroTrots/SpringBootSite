package com.SpringSiteGOSH.Entities;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String firstname;

    @Column(length = 20, nullable = false)
    private String surname;

    @Column(length = 20, nullable = false)
    private String fathersname;

    @Column(unique = true, length = 45, nullable = false)
    private String login;

    @Column(length = 45, nullable = false)
    private String passwordof;

    @Column(unique = true, length = 45, nullable = false)
    private String email;

    @Column(nullable = false)
    private String faculty;

    @Column(nullable = false)
    private int course;

    @Column(nullable = false)
    private int groupofstudent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return passwordof;
    }

    public void setPassword(String passwordof) {
        this.passwordof = passwordof;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupofstudent() {
        return groupofstudent;
    }

    public void setGroupofstudent(int groupofstudent) {
        this.groupofstudent = groupofstudent;
    }
}
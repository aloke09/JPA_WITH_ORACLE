package com.bridgelabz.simpleJPA.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="emp007")
public class Emp
{
    @Id
    @GeneratedValue
    private int id;

    @Column(name="fName")
    private String fName;

    @Column(name="lName")
    private String lName;

    @Column(name="eMail",nullable = false,length = 200)
    private String eMail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}

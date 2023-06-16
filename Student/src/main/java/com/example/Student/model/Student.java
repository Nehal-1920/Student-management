package com.example.Student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roll;

    @Column(name="name")
    private String name;
    @Column(name="branch")
    private String branch;
    @Column(name="phone_no")
    private String phone;
    @Column(name="passing_batch")
    private String batch;
    @Column(name="current_company")
    private String company;
    @Column(name="email_id")
    private String email;

    public Student(){

    }
    public Student(long roll,String name, String branch,String phone, String batch, String company,String email ){
        this.roll=roll;
        this.name=name;
        this.branch=branch;
        this.phone=phone;
        this.batch=batch;
        this.company=company;
        this.email=email;
    }

    public long getRoll() {
        return roll;
    }
    public void setRoll(long roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}

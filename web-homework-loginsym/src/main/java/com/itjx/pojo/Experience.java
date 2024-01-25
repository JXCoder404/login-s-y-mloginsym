package com.itjx.pojo;

import java.sql.Date;

public class Experience {
    private int id;
    private String companyName;
    private String employment;
    private String statement;
    private Date beginTime;
    private Date endTime;
    private String username;

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", employment='" + employment + '\'' +
                ", statement='" + statement + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", username='" + username + '\'' +
                '}';
    }

    public Experience() {
    }

    public Experience(int id, String companyName, String employment, String statement, Date beginTime, Date endTime, String username) {
        this.id = id;
        this.companyName = companyName;
        this.employment = employment;
        this.statement = statement;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

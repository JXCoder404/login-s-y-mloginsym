package com.itjx.pojo;

import java.sql.Date;

public class Inf {
    private int id;
    private String name;
    private int age;
    private String nation;
    private java.sql.Date birthday;

    private String education;
    private String speciality;
    private String outlook;


    private String graduation;
    private String postCode;
    private String talent;
    private String username;

    private String url_image;

    @Override
    public String toString() {
        return "Inf{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", birthday=" + birthday +
                ", education='" + education + '\'' +
                ", speciality='" + speciality + '\'' +
                ", outlook='" + outlook + '\'' +
                ", graduation='" + graduation + '\'' +
                ", postCode='" + postCode + '\'' +
                ", talent='" + talent + '\'' +
                ", username='" + username + '\'' +
                ", url_image='" + url_image + '\'' +
                '}';
    }

    public Inf() {
    }

    public Inf(int id, String name, int age, String nation, Date birthday, String education, String speciality, String outlook, String graduation, String postCode, String talent, String username, String url_image) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nation = nation;
        this.birthday = birthday;
        this.education = education;
        this.speciality = speciality;
        this.outlook = outlook;
        this.graduation = graduation;
        this.postCode = postCode;
        this.talent = talent;
        this.username = username;
        this.url_image = url_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getOutlook() {
        return outlook;
    }

    public void setOutlook(String outlook) {
        this.outlook = outlook;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }
}

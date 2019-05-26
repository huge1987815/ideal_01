package com.bw.entity;

import java.sql.Date;

/**
 * Title: 类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/21-15:55
 */
public class Student {
    private int sid;//学号
    private String sname;//姓名
    private Date birthdate;//出生日期

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Student() {
    }

    public Student(String sname, Date birthdate) {
        this.sname = sname;
        this.birthdate = birthdate;
    }

    public Student(int sid, String sname, Date birthdate) {
        this.sid = sid;
        this.sname = sname;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}

package com.wl.nuaa.pojo;

import java.io.Serializable;

/**
 * @PackageName:com.wl.nuaa.pojo
 * @ClassName:User
 * @Description:
 * @Author:ZWL
 * @Date:2020/4/5 23:39
 */
public class Stu implements Serializable {
    private String stuId;
    private String stuName;

    public String getStuNumber() {
        return stuId;
    }

    public void setStuNumber(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
}

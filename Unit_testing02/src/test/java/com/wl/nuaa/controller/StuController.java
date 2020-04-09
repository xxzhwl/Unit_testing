package com.wl.nuaa.controller;

import com.wl.nuaa.dao.StuDao;
import com.wl.nuaa.pojo.Stu;

import javax.servlet.http.HttpServletRequest;

/**
 * @PackageName:com.wl.nuaa.controller
 * @ClassName:UserController
 * @Description:
 * @Author:ZWL
 * @Date:2020/4/5 23:38
 */
public class StuController {

    private final StuDao stuDao;

    public StuController(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    public String loginController(HttpServletRequest request){
        final String id = request.getParameter("stuId");
        final String name = request.getParameter("stuName");
        Stu stu = stuDao.findStu(id, name);
        if(stu==null){
            return "failure";
        }else{
            return "success";
        }
    }
}

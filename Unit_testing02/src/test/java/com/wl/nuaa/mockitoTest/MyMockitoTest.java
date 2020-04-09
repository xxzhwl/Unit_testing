package com.wl.nuaa.mockitoTest;
import com.wl.nuaa.controller.StuController;
import com.wl.nuaa.dao.StuDao;
import com.wl.nuaa.pojo.Stu;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;

import static org.mockito.Mockito.*;
/**
 * @PackageName:com.wl.nuaa
 * @ClassName:test
 * @Description:
 * @Author:ZWL
 * @Date:2020/4/5 22:57
 */
@RunWith(MockitoJUnitRunner.class)
public class MyMockitoTest {
    private StuDao stuDao;
    private HttpServletRequest request;
    private StuController stuController;
    @Before
    public void test_Before(){
        this.stuDao = mock(StuDao.class);
        this.request = mock(HttpServletRequest.class);
        this.stuController = new StuController(stuDao);
    }

    @Test
    public void testLoginSuccess() {
        Stu zwl = new Stu();
        when(request.getParameter("stuId")).thenReturn("SF1916059");
        when(request.getParameter("stuName")).thenReturn("展万里");
        when(stuDao.findStu(anyString(),anyString())).thenReturn(zwl);
        String s = stuController.loginController(request);
        assertEquals(s,"success");
    }

    @Test
    public void testLoginFailed() {
        when(request.getParameter("stuId")).thenReturn("SF1916059");
        when(request.getParameter("stuName")).thenReturn("展万里");
        when(stuDao.findStu(anyString(),anyString())).thenReturn(null);
        String s = stuController.loginController(request);
        assertEquals(s,"failure");
    }
}
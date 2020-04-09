package com.wl.nuaa.suit;

import com.wl.nuaa.task.TaskTest1;
import com.wl.nuaa.task.TaskTest2;
import com.wl.nuaa.task.TaskTest3;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @PackageName:com.wl.nuaa
 * @ClassName:SuitTest
 * @Description:
 * @Author:ZWL
 * @Date:2020/4/5 21:14
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class, TaskTest2.class, TaskTest3.class})
public class SuitTest1 {

}

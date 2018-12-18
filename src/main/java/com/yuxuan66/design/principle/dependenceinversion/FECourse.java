package com.yuxuan66.design.principle.dependenceinversion;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 15:41
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Yuxuan 在学习FE课程");
    }
}

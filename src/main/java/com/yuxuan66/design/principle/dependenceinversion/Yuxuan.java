package com.yuxuan66.design.principle.dependenceinversion;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 15:38
 */
public class Yuxuan {

    private ICourse iCourse;

    public Yuxuan(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public Yuxuan() {
    }

    public void studyCourse(){
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}

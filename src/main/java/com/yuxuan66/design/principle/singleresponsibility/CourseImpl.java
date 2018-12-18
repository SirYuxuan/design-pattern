package com.yuxuan66.design.principle.singleresponsibility;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 16:06
 */
public class CourseImpl implements ICourseManager,ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}

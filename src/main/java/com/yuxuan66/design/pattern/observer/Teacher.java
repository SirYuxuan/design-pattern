package com.yuxuan66.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 老师抽象类,有发布考试的动作，和通知学生的方法(观察者)
 * @author Sir丶雨轩
 */
public abstract class Teacher {

    /**
     * 学生列表
     */
    protected List<Student> students = new ArrayList<>();

    /**
     * 发布考试
     * @param course 课程
     */
    abstract void postExam(String course);

    /**
     * 通知所有学生
     * @param course 课程
     */
    abstract void notifyAllStudent(String course);

    /**
     * 订阅,添加观察者对象
     *
     * @param student 观察者
     */
    abstract void addAttach(Student student);
}

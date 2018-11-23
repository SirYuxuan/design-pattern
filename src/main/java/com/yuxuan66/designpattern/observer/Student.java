package com.yuxuan66.designpattern.observer;

/**
 * 学生类,观察老师发布考试的动作
 * @author Sir丶雨轩
 */
public abstract class Student {


    /**
     * 开始考试了
     * @param course 科目
     */
     abstract void exam(String course);

}

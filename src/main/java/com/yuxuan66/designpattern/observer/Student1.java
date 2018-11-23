package com.yuxuan66.designpattern.observer;

public class Student1 extends Student {
    @Override
    void exam(String course) {
        System.out.println("学生1开始考试了,科目为："+course);
    }
}

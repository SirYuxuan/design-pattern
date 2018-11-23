package com.yuxuan66.designpattern.observer;

public class Student2 extends Student {
    @Override
    void exam(String course) {
        System.out.println("学生2开始考试，科目为：" + course);
    }
}

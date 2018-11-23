package com.yuxuan66.designpattern.observer;

/**
 * 演示观察者模式
 * @author Sir丶雨轩
 */
public class Demo {

    public static void main(String ...args){
        //被观察者，老师
        Teacher teacher = new ChineseTeacher();
        //观察者，学生1
        Student student1 = new Student1();
        //观察者，学生2
        Student student2 = new Student2();
        //给被观察者添加观察者对象
        teacher.addAttach(student1);
        teacher.addAttach(student2);
        //老师开始考试,所有学生收到考试通知。。。
        teacher.postExam("语文");

    }
}

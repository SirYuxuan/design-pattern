package com.yuxuan66.designpattern.observer;

/**
 * 中文老师，发布考试 被观察者
 *
 * @author Sir丶雨轩
 */
public class ChineseTeacher extends Teacher {


    /**
     * 订阅,添加观察者对象
     *
     * @param student 观察者
     */
    @Override
    public void addAttach(Student student) {
        students.add(student);
    }

    @Override
    void postExam(String course) {
        notifyAllStudent(course);
    }

    @Override
    void notifyAllStudent(String course) {
        for (Student student : students) {
            student.exam(course);
        }
    }
}

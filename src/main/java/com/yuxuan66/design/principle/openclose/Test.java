package com.yuxuan66.design.principle.openclose;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 15:14
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + "课程名称:" + javaCourse.getName() + "课程原价:" + javaCourse.getOriginPrice() + "课程折后价格:" + javaCourse.getPrice() + "元");
    }
}

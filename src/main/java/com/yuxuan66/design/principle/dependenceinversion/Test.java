package com.yuxuan66.design.principle.dependenceinversion;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 15:35
 */
public class Test {
    //v1
//    public static void main(String[] args) {
//        Yuxuan yuxuan = new Yuxuan();
//        yuxuan.studyFECourse();
//        yuxuan.studyJavaCourse();
//    }
    //v2
//    public static void main(String[] args) {
//        Yuxuan yuxuan = new Yuxuan();
//        yuxuan.studyCourse(new JavaCourse());
//        yuxuan.studyCourse(new FECourse());
//    }
    //v3
//    public static void main(String[] args) {
//        Yuxuan yuxuan = new Yuxuan(new JavaCourse());
//        yuxuan.studyCourse();
//    }

    public static void main(String[] args) {
        Yuxuan yuxuan = new Yuxuan();
        yuxuan.setiCourse(new JavaCourse());
        yuxuan.studyCourse();
    }
}

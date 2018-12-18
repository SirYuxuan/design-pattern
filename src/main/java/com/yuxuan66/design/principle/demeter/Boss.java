package com.yuxuan66.design.principle.demeter;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 16:35
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}

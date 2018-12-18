package com.yuxuan66.design.principle.demeter;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 16:30
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandCheckNumber(new TeamLeader());
    }
}

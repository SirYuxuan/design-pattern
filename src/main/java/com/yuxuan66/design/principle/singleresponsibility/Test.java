package com.yuxuan66.design.principle.singleresponsibility;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 15:52
 */
public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}

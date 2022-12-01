package com.yuxuan66.designpattern.principle;

/**
 * 单一职责原则
 *
 * @author Sir丶雨轩
 * @since 2021/12/23
 */
public class SingleResponsibilityPrinciple {


    static class Animal {
        public void move(String animal) {
            System.out.println(animal + "在地上走");
        }

        public void move2(String animal) {
            System.out.println(animal + "在水里游");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.move("牛");
        animal.move("羊");
        animal.move("猪");
        animal.move2("鱼");
    }

}

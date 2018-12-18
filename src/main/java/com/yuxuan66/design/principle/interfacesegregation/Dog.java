package com.yuxuan66.design.principle.interfacesegregation;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 16:24
 */
public class Dog  implements ISwimAnimaAction,IEatAnimaAction{
    @Override
    public void eat() {
        System.out.println("");
    }


    @Override
    public void swim() {

    }
}

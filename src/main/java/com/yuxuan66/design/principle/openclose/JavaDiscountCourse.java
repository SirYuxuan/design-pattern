package com.yuxuan66.design.principle.openclose;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 15:21
 */
public class JavaDiscountCourse extends JavaSource {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}

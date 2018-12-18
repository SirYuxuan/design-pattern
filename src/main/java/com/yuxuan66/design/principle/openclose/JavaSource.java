package com.yuxuan66.design.principle.openclose;

/**
 * @author Sir丶雨轩
 * @date 2018/12/18 15:13
 */
public class JavaSource implements  ICourse {

    private Integer id;
    private String name;
    private  Double price;

    public JavaSource(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }


}

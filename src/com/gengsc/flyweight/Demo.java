package com.gengsc.flyweight;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-01 10:05
 */
public class Demo {

    public static void main(String[] args) {
        int intrinsicstate = 22;
        FlyweightFactory factory = new FlyweightFactory();

        FlyWeight fx = factory.getFlyweight("X");
        fx.operation(--intrinsicstate);

        FlyWeight fy = factory.getFlyweight("Y");
        fy.operation(--intrinsicstate);

        FlyWeight fz = factory.getFlyweight("Z");
        fz.operation(--intrinsicstate);


        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--intrinsicstate);
    }
}

package com.gengsc.flyweight;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-01 10:00
 */
public class UnsharedConcreteFlyweight implements FlyWeight {
    @Override
    public void operation(int intrinsicstate) {
        System.out.println("不共享具体：" + intrinsicstate);
    }
}

package com.gengsc.flyweight;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-01 9:58
 */
public class ConcreteFlyweight implements FlyWeight {
    @Override
    public void operation(int intrinsicstate) {
        System.out.println("具体flyweight：" + intrinsicstate);
    }
}

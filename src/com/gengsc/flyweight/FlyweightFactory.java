package com.gengsc.flyweight;

import java.util.HashMap;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-11-01 10:02
 */
public class FlyweightFactory {

    private HashMap<String, FlyWeight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        super();
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public FlyWeight getFlyweight(String key) {
        return flyweights.get(key);
    }
}

package com.gengsc.mediator;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-31 10:54
 */
public class ConcreteColleage1 extends Colleague {

    public ConcreteColleage1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notifyColleague(String message) {
        System.out.println("同事一得到消息：" + message);
    }
}

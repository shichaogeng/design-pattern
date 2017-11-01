package com.gengsc.mediator;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-31 10:57
 */
public class Demo {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleage1(mediator);
        Colleague colleague2 = new ConcreteColleage2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("吃过饭了吗");
        colleague2.send("没有呢，你打算请客？");
    }
}

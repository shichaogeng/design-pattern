package com.gengsc.mediator;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-31 10:48
 */
public class ConcreteMediator implements Mediator {

    private Colleague colleague1;

    private Colleague colleague2;

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notifyColleague(message);
        } else {
            colleague1.notifyColleague(message);
        }
    }
}

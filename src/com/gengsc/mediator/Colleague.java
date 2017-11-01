package com.gengsc.mediator;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-31 10:47
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void notifyColleague(String message);

    public void send(String message) {
        mediator.send(message, this);
    }
}

package com.gengsc.mediator;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-31 10:45
 */
public interface Mediator {

    void send(String message, Colleague colleague);
}

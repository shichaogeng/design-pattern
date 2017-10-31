package com.gengsc.chainofresponsibility;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 10:12
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(getName() + ":" + request.getRequestContent() + " 数量" + request.getNumber() + " 被批准");
        } else if (null != request) {
            getSuperior().requestApplications(request);
        }
    }
}

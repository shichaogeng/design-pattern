package com.gengsc.chainofresponsibility;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 10:12
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.println(getName() + ":" + request.getRequestContent() + " 数量" + request.getNumber() + " 被批准");
        } else if ("加薪".equals(request.getRequestType())) {
            if (request.getNumber() <= 500) {
                System.out.println(getName() + ":" + request.getRequestContent() + " 数量" + request.getNumber() + " 被批准");
            } else if (request.getNumber() > 500) {
                System.out.println(getName() + ":" + request.getRequestContent() + " 数量" + request.getNumber() + " 再说吧");
            }

        }

    }
}

package com.gengsc.chainofresponsibility;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 10:26
 */
public class Demo {

    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("金立");
        Majordomo zongian = new Majordomo("宗剑");
        GeneralManager zhognjingli = new GeneralManager("钟精励");
        jinli.setSuperior(zongian);
        zongian.setSuperior(zhognjingli);

        Request leave_1 = new Request();
        leave_1.setRequestType("请假");
        leave_1.setRequestContent("小菜请假");
        leave_1.setNumber(1);
        jinli.requestApplications(leave_1);

        Request leave_4 = new Request();
        leave_4.setRequestType("请假");
        leave_4.setRequestContent("小菜请假");
        leave_4.setNumber(4);
        jinli.requestApplications(leave_4);

        Request raise_500 = new Request();
        raise_500.setRequestType("加薪");
        raise_500.setRequestContent("小菜请求加薪");
        raise_500.setNumber(500);
        jinli.requestApplications(raise_500);

        Request raise_1000 = new Request();
        raise_1000.setRequestType("加薪");
        raise_1000.setRequestContent("小菜请求加薪");
        raise_1000.setNumber(1000);
        jinli.requestApplications(raise_1000);
    }
}

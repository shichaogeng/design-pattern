package com.gengsc.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {

    private List<Command> commands = new ArrayList<>();

    public void addOrder(Command command) {

        if ("烤鸡翅".equals(command.toString())) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        } else {
            this.commands.add(command);
            System.out.println("增加订单" + command.toString() + " 时间：" + new Date());
        }

    }

    public void cancelOrder(Command command) {

        commands.remove(command);
        System.out.println("取消订单" + command.toString() + " 时间：" + new Date());
    }

    public void notifyBarbecuer() {

        for (Command command : commands) {
            command.executeCommnad();
        }
    }

}

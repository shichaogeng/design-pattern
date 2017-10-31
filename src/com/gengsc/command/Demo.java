package com.gengsc.command;

public class Demo {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        BakeChickenWingCommand bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);

        Waiter waiter = new Waiter();
        waiter.addOrder(bakeMuttonCommand);
        waiter.addOrder(bakeChickenWingCommand);
        waiter.addOrder(bakeMuttonCommand);

        System.out.println();
        System.out.println("执行命令：");
        waiter.notifyBarbecuer();
    }
}

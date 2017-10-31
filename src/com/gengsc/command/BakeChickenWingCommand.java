package com.gengsc.command;

public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommnad() {
        barbecuer.bakeChickenWing();
    }

    public String toString() {
        return "烤鸡翅";
    }
}

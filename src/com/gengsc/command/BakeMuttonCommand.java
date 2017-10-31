package com.gengsc.command;

public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommnad() {
        barbecuer.bakeMutton();
    }

    public String toString() {
        return "烤羊肉";
    }
}

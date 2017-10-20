package com.gengsc.state;

public class VertigoState implements RunState {
    @Override
    public void run(Hero hero) {
        System.out.println("---------------眩晕-----------------");
        try {
            Thread.sleep(4000);//假设眩晕持续4s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.setState(Hero.COMMON_SPEED);
        System.out.println("-----------------眩晕结束，恢复正常-----------------------");
    }
}

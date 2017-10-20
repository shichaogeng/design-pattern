package com.gengsc.state;

public class SpeedUpState implements RunState {
    @Override
    public void run(Hero hero) {
        System.out.println("---------------加速跑动-----------------");
        try {
            Thread.sleep(4000);//假设加速持续4s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.setState(Hero.COMMON_SPEED);
        System.out.println("-----------------加速结束，恢复正常-----------------------");
    }
}

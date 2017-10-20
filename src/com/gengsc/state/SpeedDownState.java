package com.gengsc.state;

public class SpeedDownState implements RunState {

    @Override
    public void run(Hero hero) {
        System.out.println("-------------减速跑动-------------");
        try {
            Thread.sleep(4000);//减速4s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.setState(Hero.COMMON_SPEED);
        System.out.println("----------------减速结束，恢复正常------------------");
    }
}

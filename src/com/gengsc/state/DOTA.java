package com.gengsc.state;

public class DOTA {

    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP);
        Thread.sleep(5000);
        hero.setState(Hero.SPEED_DOWN);
        Thread.sleep(5000);
        hero.setState(Hero.VERTIGO);
        Thread.sleep(5000);
        hero.stopRun();
    }
}

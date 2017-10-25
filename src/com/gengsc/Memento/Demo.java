package com.gengsc.Memento;

public class Demo {

    public static void main(String[] args) {
        //崔赫意气风发
        GameRole cuihe = new GameRole();
        cuihe.setInitState();
        cuihe.stateDisplay();

        //保存数据
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(cuihe.saveState());

        //大战boss
        cuihe.fight();
        cuihe.stateDisplay();

        //赶紧回档,感觉re0
        cuihe.recoveryState(caretaker.getMemento());
        cuihe.stateDisplay();

    }
}

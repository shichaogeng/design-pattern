package com.gengsc.Memento;

public class GameRole {
    private int vitality;
    private int attach;
    private int defense;

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttach() {

        return attach;
    }

    public void setAttach(int attach) {
        this.attach = attach;
    }

    public int getVitality() {

        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    //创建备忘录
    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.vitality, this.attach, this.defense);
    }

    //恢复备忘录
    public void recoveryState(RoleStateMemento memento) {
        this.vitality = memento.getVitality();
        this.attach = memento.getAttach();
        this.defense = memento.getDefense();
    }


    public void stateDisplay() {
        System.out.println("角色当前状态： ");
        System.out.println("体力：" + this.vitality);
        System.out.println("攻击力：" + this.attach);
        System.out.println("防御：" + this.defense);
    }

    public void setInitState() {
        this.vitality = 100;
        this.attach = 100;
        this.defense = 100;
    }

    public void fight() {
        this.vitality = 0;
        this.attach = 0;
        this.defense = 0;
    }
}

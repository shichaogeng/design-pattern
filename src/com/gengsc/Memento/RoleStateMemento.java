package com.gengsc.Memento;

public class RoleStateMemento {

    private int vitality;
    private int attach;
    private int defense;

    public RoleStateMemento(int vitality, int attach, int defense) {
        this.vitality = vitality;
        this.attach = attach;
        this.defense = defense;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttach() {
        return attach;
    }

    public void setAttach(int attach) {
        this.attach = attach;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}

package com.gengsc.Composite;

public abstract class AbstractCompany {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractCompany(String name) {
        this.name = name;
    }

    public abstract void add(AbstractCompany company);//增加

    public abstract void remove(AbstractCompany company);//移除

    public abstract void display(int depth);//显示

    public abstract void lineOfDuty();//履行职责
}

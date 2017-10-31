package com.gengsc.chainofresponsibility;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2017-10-30 10:06
 */
public abstract class Manager {

    private String name;

    private Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Manager getSuperior() {
        return superior;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);

}

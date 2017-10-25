package com.gengsc.Composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends AbstractCompany {

    private List<AbstractCompany> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany company) {
        children.add(company);
    }

    @Override
    public void remove(AbstractCompany company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("-");
        }
        System.out.println(indent + this.getName());
        for (AbstractCompany child : children) {
            child.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (AbstractCompany child : children) {
            child.lineOfDuty();
        }
    }
}

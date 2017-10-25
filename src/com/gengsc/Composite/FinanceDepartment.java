package com.gengsc.Composite;

public class FinanceDepartment extends AbstractCompany {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompany company) {

    }

    @Override
    public void remove(AbstractCompany company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("-");
        }
        System.out.println(indent + this.getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.getName() + " 公司财务收支管理");
    }
}

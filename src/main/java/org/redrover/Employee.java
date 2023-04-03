package org.redrover;

public class Employee {
    private String name;
    private int BaseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        BaseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }
}

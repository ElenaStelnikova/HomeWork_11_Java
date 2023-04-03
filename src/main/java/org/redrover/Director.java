package org.redrover;

public class Director extends BaseManager{
    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryDirector() {
        if( getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return (int)(getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }

    public int getBonusDirector() {
        return (int)getSalaryDirector() - getBaseSalary();
    }}

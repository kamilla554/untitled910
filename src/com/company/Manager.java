package com.company;

public class Manager extends Employee {
    public String getJobTitle() {
        return "Manager";
    }

    public double calcSalary() {
        return salary + 0.05 * company.getIncome();
    }
}

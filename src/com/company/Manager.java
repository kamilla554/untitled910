package com.company;

public class Manager extends Employee {
    public Manager(String name, String surname, double salary, Company company) {
        super(name, surname, salary, company);
    }

    public String getJobTitle() {
        return "Manager";
    }

    public double calcSalary() {
        return salary + 0.05 * company.getIncome();
    }
}

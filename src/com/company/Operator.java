package com.company;

public class Operator extends Employee {
    public Operator(String name, String surname, double salary, Company company) {
        super(name, surname, salary, company);
    }

    public String getJobTitle() {
        return "Operator";
    }

    public double calcSalary() {
        return salary;
    }

}

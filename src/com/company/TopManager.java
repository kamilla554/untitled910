package com.company;

public class TopManager extends Employee {
    public TopManager(String name, String surname, double salary, Company company) {
        super(name, surname, salary, company);
    }

    public String getJobTitle()
    {
        return "Top Manager";
    }
    public double calcSalary()
    {
        if (company.employeeIncome()>10000000) return salary*2.5;
        else return salary;//???
    }
}

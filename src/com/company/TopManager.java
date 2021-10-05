package com.company;

public class TopManager extends Employee {
    public String getJobTitle()
    {
        return "Top Manager";
    }
    public double calcSalary()
    {
        return salary*2.5*company.employeeIncome();//???
    }
}

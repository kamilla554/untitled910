package com.company;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    double profit = Math.random() * (140000 - 115000) + 115000;

    public double getIncome() {
        return profit;
    }

    public double employeeIncome() {
        int j = 0;
        for (Employee t : employees) {
            if (t.getJobTitle() != "Top Manager") {
                j += t.calcSalary();
            }
        }
        return j;
    }

    protected void hire(Employee newE) {
        employees.add(newE);
    }


    protected void hireAll(ArrayList<Employee> newE) {
        for (Employee t : newE) {
            employees.add(t);
        }
    }

    protected void fire(Employee f) {
        employees.remove(employees.indexOf(f));
    }

}

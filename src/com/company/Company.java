package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    int profit = (int)(Math.random() * (140000 - 115000) + 115000);
    ArrayList<Integer> salaries = new ArrayList<Integer>();

    public int getIncome() {
        return profit;
    }

    public int employeeIncome() {
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
        salaries.add((int) newE.calcSalary());
    }


    protected void hireAll(ArrayList<Employee> newE) {
        for (Employee t : newE) {
            employees.add(t);
            salaries.add((int) t.calcSalary());
        }
    }

    protected void fire(Employee f) {
        employees.remove(employees.indexOf(f));
        salaries.remove(employees.indexOf(f));
    }

    protected ArrayList<Double> getLowestSalaryStaff(int count) {
        ArrayList<Double> temp = new ArrayList<Double>();
        Collections.sort(employees);
        for (int i = 0; i < count; i++) {
            temp.add(employees.get(i).calcSalary());
        }
        return temp;
    }

    protected ArrayList<Double> getTopSalaryStaff(int count) {
        ArrayList<Double> temp = new ArrayList<Double>();
        Collections.sort(employees);
        for (int i = 0; i < count; i++) {
            temp.add(employees.get(employees.size() - i -1).calcSalary());
        }
        return temp;
    }
}

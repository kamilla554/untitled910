package com.company;

abstract public class Employee implements EmployeePosition, Comparable<Employee> {
    String name;
    String surname;
    double salary;
    Company company;

    public Employee(String name, String surname, double salary, Company company) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.calcSalary() - o.calcSalary());
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Company jej = new Company();
        System.out.println(jej.getIncome());
        Operator a = new Operator("b", "b", 40000, jej);
        for (int i = 0; i < 180; i++) {
            jej.hire(a);
            if (i < 80) jej.hire(new Manager("b", "b", 60000, jej));
            if (i < 10) jej.hire(new TopManager("a", "a", (int) (Math.random() * 20000 + 80000), jej));
        }
        System.out.println(jej.getTopSalaryStaff(10));
        System.out.println(jej.getLowestSalaryStaff(10));
        for (int i = 0; i < 135; i++) {
            jej.fire(a);
        }
        System.out.println(jej.getTopSalaryStaff(10));
        System.out.println(jej.getLowestSalaryStaff(10));
    }
}
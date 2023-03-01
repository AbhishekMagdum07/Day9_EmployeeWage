package com.bridgelabz_empwage;

import java.util.Random;
public class EmployeeWage {
    Random random = new Random();
    void wagesForMonth() {
        int fullTime = 0;
        int partTime = 1;
        int empHour = 0;
        int wagePerHr = 20;
        int empWage = 0;
        int totalWorkingDays = 20; // Total working days in a month.
        int attendance = random.nextInt(3);

        if (attendance == fullTime) {
            empHour = 8;
            System.out.println("Employee is doing FullTime job");
        } else if (attendance == partTime) {
            empHour = 4;
            System.out.println("Employee is doing PartTime Job");
        } else {
            empHour = 0;
            System.out.println("Employee is Absent");
        }

        empWage = empHour * wagePerHr * totalWorkingDays;

        System.out.println("Employee wage for a month is = " + empWage);
    }

    public static void main(String[] args) {;
        EmployeeWage runner = new EmployeeWage();
        runner.wagesForMonth();
    }
}

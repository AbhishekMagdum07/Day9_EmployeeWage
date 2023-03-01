package com.bridgelabz_empwage;

import java.util.Random;
public class EmployeeWage {
    Random random = new Random();
    void switchCase(){
       final int fullTime = 0;
       final int partTime = 1;
        int empHour  = 0;
        int wagePerHr = 20;
        int empWage = 0;
        int attendance = random.nextInt(3);

        switch (attendance) {
            case fullTime :
                empHour = 8;
                System.out.println("Employee is doing FullTime job"); break;

            case partTime:
                empHour = 4;
                System.out.println("Employee is doing PartTime Job"); break;

            default :
                empHour = 0;
                System.out.println("Employee is absent");
        }

        empWage = empHour * wagePerHr;

        System.out.println("Employee Wage is = "+empWage);
    }

    public static void main(String[] args) {;
        EmployeeWage runner = new EmployeeWage();
        runner.switchCase();
    }
}

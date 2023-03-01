package com.bridgelabz_empwage;

import java.util.Random;
public class EmployeeWage {
    Random random = new Random();
    void dailyWage(){
        int fullTime = 0;
        int empHour  = 0;
        int wagePerHr = 20;
        int empWage = 0;
        int attendance = random.nextInt(2);

        if(attendance == fullTime) {
            empHour = 8;
            System.out.println("Employee is Present");
        }
        else {
            empHour = 0;
            System.out.println("Employee is Absent");
        }
        empWage = empHour * wagePerHr;

        System.out.println("Daily Employee Wage is = "+empWage);
    }
    public static void main(String[] args) {;
        EmployeeWage runner = new EmployeeWage();
        runner.dailyWage();
    }
}

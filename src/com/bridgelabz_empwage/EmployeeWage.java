package com.bridgelabz_empwage;

import java.util.Random;

public class EmployeeWage {
    Random random = new Random();
    int fullTime = 0;
    int partTime = 1;
    int empHour;
    int totalWorkingDays = 0;
    int totalEmpHour = 0;
    int empWage = 0;


    void companyWages(String companyName, int wagePerHr,int maxWorkingHours, int maxWorkingDays) {
        System.out.println("Company Name = "+companyName);

        while (totalEmpHour < maxWorkingHours && totalWorkingDays < maxWorkingDays) {
            totalWorkingDays++;
            int attendance = random.nextInt(3);

            if (attendance == fullTime) {
                empHour = 8; // fullTime job.

            } else if (attendance == partTime) {
                empHour = 4; // partTime job.

            } else {
                empHour = 0; // employee is absent.

            }

            totalEmpHour += empHour;
        }
        empWage = totalEmpHour * wagePerHr;

        System.out.println("Total Employee Wage is   = " + empWage);
        System.out.println("============================================================");

    }
    public static void main(String[] args) {

        EmployeeWage runer = new EmployeeWage();
        runer.companyWages("Tata",20,120,22);
        runer.companyWages("Maruti",22,100,21);
        runer.companyWages("Mahindra",18,105,23);
    }
}

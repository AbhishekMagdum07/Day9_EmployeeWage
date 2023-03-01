package com.bridgelabz_empwage;

import java.util.Random;
public class EmployeeWage {
    Random random = new Random();
    void attendance(){
        int numbers = random.nextInt(2);
        if (numbers == 0) {
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String[] args) {
        EmployeeWage runner = new EmployeeWage();
        runner.attendance();
    }
}

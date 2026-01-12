package com;

class EmployeePayroll
{
    int employeeID;

    EmployeePayroll(int employeeID)
    {
        this.employeeID = employeeID;
    }

    double calculateSalary(int hoursWorked, double rate)
    {
        return hoursWorked * rate;
    }

    double calculateSalary(int employeeID, double bonus)
    {
        return bonus;
    }

    double calculateSalary(double annualSalary)
    {
        return annualSalary / 12;
    }

    double calculateSalary(int hoursWorked, double rate, int overtimeHours)
    {
        return (hoursWorked * rate) + (overtimeHours * rate * 1.5);
    }

    double calculateSalary(double salary, double deductions)
    {
        return salary - deductions;
    }

    double calculateSalary(double salary, double bonus, double deductions)
    {
        return salary + bonus - deductions;
    }
}

public class Practical_3
{
    public static void main(String[] args)
    {
        EmployeePayroll emp = new EmployeePayroll(101);

        System.out.println("Employee ID: " + emp.employeeID);
        System.out.println("Salary (Hours & Rate): " + emp.calculateSalary(40, 200));
        System.out.println("Salary (ID with Bonus): " + emp.calculateSalary(101, 5000));
        System.out.println("Monthly Salary (Annual): " + emp.calculateSalary(600000));
        System.out.println("Salary (With Overtime): " + emp.calculateSalary(40, 200, 10));
        System.out.println("Salary (With Deductions): " + emp.calculateSalary(30000, 2000));
        System.out.println("Salary (Bonus & Deductions): " + emp.calculateSalary(30000, 5000, 2000));
    }
}

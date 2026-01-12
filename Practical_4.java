package com;
abstract class BankAccount
{
    double balance;

    BankAccount(double balance)
    {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance()
    {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount
{
    final double MIN_BALANCE = 1000;

    SavingsAccount(double balance)
    {
        super(balance);
    }

    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount)
    {
        if (balance - amount >= MIN_BALANCE)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Withdrawal denied! Minimum balance of 1000 must be maintained.");
        }
    }
}

class CurrentAccount extends BankAccount
{
    final double OVERDRAFT_LIMIT = 5000;

    CurrentAccount(double balance)
    {
        super(balance);
    }

    void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount)
    {
        if (balance - amount >= -OVERDRAFT_LIMIT)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }
}

public class Practical_4
{
    public static void main(String[] args)
    {
        System.out.println("Savings Account Transactions");
        SavingsAccount sa = new SavingsAccount(5000);
        sa.deposit(2000);
        sa.withdraw(5500);
        sa.displayBalance();

        System.out.println("\nCurrent Account Transactions");
        CurrentAccount ca = new CurrentAccount(3000);
        ca.deposit(1000);
        ca.withdraw(8000);
        ca.displayBalance();
    }
}

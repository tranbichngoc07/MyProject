package com.example;

interface IWorkable{
    void work();
}
abstract class Employee implements IWorkable{
    public String id, name;
    public double baseSalary;
    public Employee(String id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName(){
        return this.name;
    }
    abstract double calculatePay();
}

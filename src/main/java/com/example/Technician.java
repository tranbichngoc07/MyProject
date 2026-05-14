package com.example;

class Technician extends  Employee{
    public double overtimeHours;
    public Technician(String id, String name, Double baseSalary, Double overtimeHours){
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculatePay() {
        return baseSalary+overtimeHours*20000;
    }
    @Override
    public void work(){
        System.out.println("Lắp đặt thiết bị");
    }
}

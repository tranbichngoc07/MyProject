package com.example;

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] arr = new Employee[n];
        for(int i = 0; i < n; i++){
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();
            double baseSalary = sc.nextDouble();
            if(type.equals("O")){
                arr[i] = new OfficeWorker(id, name, baseSalary);
            }
            else if(type.equals("T")){
                double overtimeHours = sc.nextDouble();
                arr[i] = new Technician(id, name, baseSalary, overtimeHours);
            }
        }
        double total = 0;
        for(Employee employee: arr){
            System.out.println(employee.getName() +  " - Pay: " + employee.calculatePay());
            employee.work();
            System.out.println();
            total += employee.calculatePay();
        }
        System.out.println("Total Pay = " + total);
    }
}

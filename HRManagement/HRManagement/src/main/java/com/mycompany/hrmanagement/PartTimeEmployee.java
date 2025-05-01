/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

import java.util.*;

/**
 *
 * @author Student
 */
public class PartTimeEmployee extends Employee {

    private int workingHour;
    private float payRate;

    public PartTimeEmployee(int workingHour, float payRate, String id, String name, int yearOfBirth, String address, String phone) {
        super(id, name, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee(int workingHour, float payRate) {
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public PartTimeEmployee() {
    }

    public void InputPartTimeEmployee() {
        super.InputEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Working hour: ");
        workingHour = sc.nextInt();
        sc.nextLine();
        System.out.print("Pay rate: ");
        payRate = sc.nextFloat();
        sc.nextLine();
    }

    public void EditPartTimeEmp() {
        System.out.println(this.getInfo());
        super.Edit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Edit Working hour: ");
        workingHour = sc.nextInt();
        sc.nextLine();
        System.out.print("Edit Pay rate: ");
        payRate = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public String getInfo() {
        String s = "ID: " + id + " Name: " + name + " YOB: " + yearOfBirth + " Address: " + address + " Phone: " + phone + " Working Hour: " + workingHour + " Pay rate: " + payRate;
        return s;
    }

    @Override
    public float getPayment() {
        return (float) workingHour * payRate;
    }
}

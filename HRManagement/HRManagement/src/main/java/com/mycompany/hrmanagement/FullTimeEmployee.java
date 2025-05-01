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
public class FullTimeEmployee extends Employee {

    private float salary;

    public FullTimeEmployee(float salary, String id, String name, int yearOfBirth, String address, String phone) {
        super(id, name, yearOfBirth, address, phone);
        this.salary = salary;
    }

    public FullTimeEmployee(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee() {
    }

    public void InputFullTimeEmployee() {
        super.InputEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        salary = sc.nextFloat();
        sc.nextLine();
    }

    public void EditFullTimeEmp() {
        System.out.println(this.getInfo());
        super.Edit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Edit Salary: ");
        salary = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public String getInfo() {
        String s = "ID: " + id + " Name: " + name + " YOB: " + yearOfBirth + " Address: " + address + " Phone: " + phone + " Salary: " + salary;
        return s;
    }

    @Override
    public float getPayment() {
        return salary;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manageemployeesalary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class SalaryList {

    private ArrayList<Employee> list = new ArrayList<>();

    public SalaryList() {
    }

    public SalaryList(Employee newEmployee) {
        this.list.add(newEmployee);
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee emp = new Employee();
            emp.Input();
            list.add(emp);
        }
    }

    public void printHighestSalary() {
        double maxSalary = 0;
        for (Employee i : list) {
            if (i.getSalary() >= maxSalary) {
                maxSalary = i.getSalary();
            }
        }
        for (Employee i : list) {
            if (i.getSalary() == maxSalary) {
                System.out.println("---------Hightest Salary------");
                i.printEmployee();
            }
        }
    }
    Comparator<Employee> comSalary = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getSalary() - o1.getSalary());
        }
    };

    public void sortSalary() {
        Collections.sort(list, comSalary);
    }

    public void printSalary() {
        for (Employee i : list) {
            i.printEmployee();
        }
    }
}

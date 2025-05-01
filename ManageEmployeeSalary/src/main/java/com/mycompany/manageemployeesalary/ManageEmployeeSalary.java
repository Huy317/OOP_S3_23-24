/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.manageemployeesalary;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ManageEmployeeSalary {

    public static void main(String[] args) {
        SalaryList list = new SalaryList();
        list.Input();
        list.printHighestSalary();
        list.sortSalary();
        list.printSalary();
    }
}

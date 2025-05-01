/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hrmanagement;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class HRManagement {

    public static void main(String[] args) {
        Manager manager = new Manager();
//        manager.addFullTimeEmp(new FullTimeEmployee(100, "1", "nguyen van a", 1990, "", ""));
//        manager.addFullTimeEmp(new FullTimeEmployee(200, "2", "tran van b", 2000, "", ""));
//        manager.addPartTimeEmp(new PartTimeEmployee(8, 5, "3", "le gia c", 2002, "", ""));
//        manager.addPartTimeEmp(new PartTimeEmployee(5, 10, "4", "le cong d", 1988, "", ""));
//        manager.addPartTimeEmp(new PartTimeEmployee(5, 5, "5", "le cong d", 1988, "", ""));

//        manager.sortByAgeAndPayment();
//        manager.displayAllEmployee();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n != 11) {
            System.out.println("Choose an action");
            System.out.println("1.Add Full time employee");
            System.out.println("2.Add part time employee");
            System.out.println("3.Show all fulltime employee");
            System.out.println("4.Show all part time employee");
            System.out.println("5.Show all employee");
            System.out.println("6.Search by id");
            System.out.println("7.Delete by id");
            System.out.println("8.Edit by id");
            System.out.println("9.Search by payment range");
            System.out.println("10.Sort by age and payment");
            System.out.println("11.Exit");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    manager.addFullTimeEmp();
                    break;
                case 2:
                    manager.addPartTimeEmp();
                    break;
                case 3:
                    manager.displayFullTimeList();
                    break;
                case 4:
                    manager.displayPartTimeList();
                    break;
                case 5:
                    manager.displayAllEmployee();
                    break;
                case 6:
                    String id = sc.nextLine();
                    manager.searchByID(id);
                    break;
                case 7:
                    String delId = sc.nextLine();
                    manager.deleteByID(delId);
                    break;
                case 8:
                    String editID = sc.nextLine();
                    manager.edit(editID);
                    break;
                case 9:
                    float from = sc.nextFloat();
                    float to = sc.nextFloat();
                    manager.searchByPayment(from, to);
                    break;
                case 10:
                    manager.sortByAgeAndPayment();
                    break;
                case 11:

                    break;

                default:
                    throw new AssertionError();
            }
        }
    }
}

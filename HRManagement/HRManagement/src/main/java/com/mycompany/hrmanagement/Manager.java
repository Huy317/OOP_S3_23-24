/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Student
 */
public class Manager {
    
    ArrayList<FullTimeEmployee> fullTimeList = new ArrayList<>();
    ArrayList<PartTimeEmployee> partTimeList = new ArrayList<>();
    
    public Manager() {
    }
    
    public Manager(ArrayList<FullTimeEmployee> full, ArrayList<PartTimeEmployee> part) {
        this.fullTimeList = full;
        this.partTimeList = part;
    }
    
    public void addFullTimeEmp() {
        FullTimeEmployee emp = new FullTimeEmployee();
        emp.InputFullTimeEmployee();
        fullTimeList.add(emp);
    }
    
    public void addFullTimeEmp(FullTimeEmployee emp) {
        fullTimeList.add(emp);
    }
    
    public void addPartTimeEmp() {
        PartTimeEmployee emp = new PartTimeEmployee();
        emp.InputPartTimeEmployee();
        partTimeList.add(emp);
    }
    
    public void addPartTimeEmp(PartTimeEmployee emp) {
        partTimeList.add(emp);
    }
    
    public void displayFullTimeList() {
        for (FullTimeEmployee i : fullTimeList) {
            System.out.println(i.getInfo());
        }
    }
    
    public void displayPartTimeList() {
        for (PartTimeEmployee i : partTimeList) {
            System.out.println(i.getInfo());
        }
    }
    
    public void displayAllEmployee() {
        displayFullTimeList();
        displayPartTimeList();
    }
    
    public void searchByID(String id) {
        for (FullTimeEmployee i : fullTimeList) {
            if (i.id.equals(id)) {
                System.out.println(i.getInfo());
                return;
            }
        }
        for (PartTimeEmployee i : partTimeList) {
            if (i.id.equals(id)) {
                System.out.println(i.getInfo());
                return;
            }
        }
    }
    
    public void deleteByID(String id) {
        for (FullTimeEmployee i : fullTimeList) {
            if (i.id.equals(id)) {
                fullTimeList.remove(i);
                return;
            }
        }
        for (PartTimeEmployee i : partTimeList) {
            if (i.id.equals(id)) {
                partTimeList.remove(i);
                return;
            }
        }
    }
    
    public void edit(String id) {
        for (FullTimeEmployee i : fullTimeList) {
            if (i.id.equals(id)) {
                i.EditFullTimeEmp();
                return;
            }
        }
        for (PartTimeEmployee i : partTimeList) {
            if (i.id.equals(id)) {
                i.EditPartTimeEmp();
                return;
            }
        }
    }
    
    public void searchByPayment(float from, float to) {
        for (FullTimeEmployee i : fullTimeList) {
            float payment = i.getPayment();
            if (Float.compare(payment, from) >= 0 && Float.compare(payment, to) <= 0) {
                System.out.println(i.getInfo());
            }
        }
        for (PartTimeEmployee i : partTimeList) {
            float payment = i.getPayment();
            if (Float.compare(payment, from) >= 0 && Float.compare(payment, to) <= 0) {
                System.out.println(i.getInfo());
            }
        }
    }
    Comparator<FullTimeEmployee> fullTimeComparator = new Comparator<FullTimeEmployee>() {
        @Override
        public int compare(FullTimeEmployee o1, FullTimeEmployee o2) {
            if (o1.getYearOfBirth() < o2.getYearOfBirth()) {
                return 1;
            }
            if (o1.getYearOfBirth() > o2.getYearOfBirth()) {
                return -1;
            }
            if (o1.getYearOfBirth() == o2.getYearOfBirth()) {
                if (o1.getPayment() > o2.getPayment()) {
                    return 1;
                } else if (o1.getPayment() < o2.getPayment()) {
                    return -1;
                }
            }
            return 0;
        }
    };
    Comparator<PartTimeEmployee> partTimeComparator = new Comparator<PartTimeEmployee>() {
        @Override
        public int compare(PartTimeEmployee o1, PartTimeEmployee o2) {
            if (o1.getYearOfBirth() < o2.getYearOfBirth()) {
                return 1;
            }
            if (o1.getYearOfBirth() > o2.getYearOfBirth()) {
                return -1;
            }
            if (o1.getYearOfBirth() == o2.getYearOfBirth()) {
                if (o1.getPayment() > o2.getPayment()) {
                    return 1;
                } else if (o1.getPayment() < o2.getPayment()) {
                    return -1;
                }
            }
            return 0;
        }
    };

    public void sortByAgeAndPayment() {
        Collections.sort(fullTimeList, fullTimeComparator);
        Collections.sort(partTimeList, partTimeComparator);
    }
}

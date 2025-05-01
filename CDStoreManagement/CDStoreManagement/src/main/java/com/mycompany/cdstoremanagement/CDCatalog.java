/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cdstoremanagement;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CDCatalog {

    private ArrayList<CD> list = new ArrayList<>();

    public CDCatalog() {
    }

    public CDCatalog(ArrayList<CD> list) {
        this.list = list;
    }

    public void addCD() {
        CD newCD = new CD();
        newCD.Input();
        list.add(newCD);
    }

    Comparator<CD> compareAboutTitle = new Comparator<CD>() {
        @Override
        public int compare(CD o1, CD o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };

    public CD searchByTitle(String title) {
//        int index = Collections.binarySearch(list, new CD("", "", title), compareAboutTitle);
//        if (index != -1) {
//            return list.get(index);
//        }
        for (CD i : list) {
            if (i.getTitle().equals(title)) {
                return i;
            }
        }
        return null;
    }
    Comparator<CD> compareAboutCollection = new Comparator<CD>() {
        @Override
        public int compare(CD o1, CD o2) {
            return o1.getCollection().compareTo(o2.getCollection());
        }
    };

    public void searchByCollection(String collection) {
//        int index = Collections.binarySearch(list, new CD(collection, "", ""), compareAboutCollection);
//        if (index != -1) {
//            return list.get(index);
//        }
        for (CD i : list) {
            if (i.getCollection().equals(collection)) {
                //return i;
                i.print();
            }
        }
    }
    Comparator<CD> compareAboutType = new Comparator<CD>() {
        @Override
        public int compare(CD o1, CD o2) {
            return o1.getType().compareTo(o2.getType());
        }
    };

    public void searchByType(String type) {
//        int index = Collections.binarySearch(list, new CD("", type, ""), compareAboutType);
//        if (index != -1) {
//            return list.get(index);
//        }
        for (CD i : list) {
            if (i.getType().equals(type)) {
//                return i;
                i.print();
            }
        }
    }

    public boolean deleteCD(String id) {
        for (CD i : list) {
            if (i.getId().equals(id)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        for (CD i : list) {
            i.print();
        }
    }

    Scanner sc = new Scanner(System.in);

    public void editCD(String id) {
        for (CD i : list) {
            if (i.getId().equals(id)) {
                i.print();
                System.out.print("Edit Collection: ");
                String collection = sc.next();
                i.setCollection(collection);
                System.out.print("Edit Type: ");
                String type = sc.next();
                i.setType(type);
                System.out.print("Edit Title: ");
                String title = sc.next();
                i.setTitle(title);
                System.out.print("Edit Price: ");
                double price = sc.nextDouble();
                i.setPrice(price);
                System.out.print("Edit Year of release: ");
                int yor = sc.nextInt();
                i.setYearOfRelease(yor);

            }
        }
    }
    Comparator<CD> compareAboutYear = new Comparator<CD>() {
        @Override
        public int compare(CD o1, CD o2) {
            if (o1.getYearOfRelease() > o2.getYearOfRelease()) {
                return 1;
            }
            if (o1.getYearOfRelease() < o2.getYearOfRelease()) {
                return -1;
            }
            if (o1.getYearOfRelease() == o2.getYearOfRelease()) {
                return 0;
            }
            return 1;
        }
    };

    public void sortByYear() {
        Collections.sort(list, compareAboutYear);
    }
}

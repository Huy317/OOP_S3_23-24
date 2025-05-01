/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cdstoremanagement;

import java.util.*;

/**
 *
 * @author Student
 */
public class CDStoreManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CDCatalog catalog = new CDCatalog();

        CD cd;
        String stringInput;
        int n = 0;
        while (n != 9) {
            System.out.println("Choose an action");
            System.out.println("1.Add CD");
            System.out.println("2.Search by title");
            System.out.println("3.Search by collection");
            System.out.println("4.Search by type");
            System.out.println("5.Delete by id");
            System.out.println("6.Edit information by id");
            System.out.println("7.Display all cd");
            System.out.println("8.Sort cd by ascending order of year of release");
            System.out.println("9.Exit");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    catalog.addCD();
                    break;
                case 2:
                    String title = sc.nextLine();

                    cd = catalog.searchByTitle(title);
                    if (cd != null) {
                        cd.print();
                        cd = null;
                    } else {
                        System.out.println("Couldn't find CD");
                    }
                    break;
                case 3:
                    String collection = sc.nextLine();
                    catalog.searchByCollection(collection);

                    break;
                case 4:
                    String type = sc.nextLine();
                    catalog.searchByType(type);

                    break;
                case 5:
                    stringInput = sc.nextLine();
                    catalog.deleteCD(stringInput);
                    break;
                case 6:
                    stringInput = sc.nextLine();
                    catalog.editCD(stringInput);
                    break;
                case 7:
                    catalog.displayAll();
                    break;
                case 8:
                    catalog.sortByYear();
                    break;
                case 9:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}

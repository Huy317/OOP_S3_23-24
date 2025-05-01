package Q1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StudentManager manager = new StudentManager();
        manager.readFile();

        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n != 8) {
            System.out.println("-------------------------------------");
            System.out.println("1.add new college student");
            System.out.println("2.add new university student");
            System.out.println("3.remove student by code");
            System.out.println("4.print list");
            System.out.println("5.print eligible for graduation");
            System.out.println("6.sort list");
            System.out.println("7.Find student by full name");
            System.out.println("8.Exit");
            System.out.println("-------------------------------------");
            System.out.print("Input: ");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:{
                    Student collegeStudent = new CollegeStudent();
                    collegeStudent.input();
                    manager.add(collegeStudent);
                    manager.writeFile();
                    break;
                }
                case 2:{
                    Student uniStudent = new UniversityStudent();
                    uniStudent.input();
                    manager.add(uniStudent);
                    manager.writeFile();
                    break;
                }
                    
                case 3:{
                    System.out.print("Enter id to remove: ");
                    String strInput = sc.nextLine();
                    manager.removeById(strInput);

                    break;
                }

                case 4:{
                    manager.print();
                    break;
                }
                    
                case 5:{
                    manager.printGraduateListAndNumber();
                    break;
                }
                    
                case 6:{
                    manager.sort();
                    break;
                }
                    
                case 7:{
                    System.out.print("Enter Full Name to search: ");
                    String strInput = sc.nextLine();
                    manager.searchByName(strInput);
                    break;
                }
                    
                case 8:
                    break;
                default:
                    break;
            }
        }
    }
}

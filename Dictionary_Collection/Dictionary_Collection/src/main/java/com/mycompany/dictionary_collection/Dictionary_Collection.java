/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dictionary_collection;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Dictionary_Collection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dict = new Dictionary();
        int n = -1;
        for (int i = 0;i<100;i++){
            String w = getRandomString(5);
            String m = getRandomString(5);
            dict.Input(w,m);
        }
        while(n != 0){
            System.out.println("1.Input a word & meaning");
            System.out.println("2.Check if a word exist");
            System.out.println("3.Search a word");
            System.out.println("0.Exit");
            String w;
            String m;
            n = sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1:
                    System.out.print("Enter a word: ");
                    w = sc.nextLine();
                    System.out.print("Enter meaning: ");
                    m = sc.nextLine();
                    dict.Input(w,m);
                    break;
                case 2:
                    System.out.print("Enter a word: ");
                    w = sc.nextLine();
                    boolean result = dict.isExist(w);
                    if (result){
                        System.out.println("Word does exist");
                    } else {
                        System.out.println("Word doesn't exist");
                    }
                    break;
                case 3:
                    System.out.print("Enter a word to search: ");
                    w = sc.nextLine();
                    System.out.println(dict.getMeaning(w));
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }
    }

    static String getRandomString(int length){
        Random rd = new Random();
        StringBuilder sb = new StringBuilder();
        String available = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i<length;i++){
            int index = rd.nextInt(0,available.length()-1);
            sb.append(available.charAt(index));
        }
        return sb.toString();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question6 {
    String string;

    public Question6() {
    }

    public Question6(String string) {
        this.string = string;
    }
    public int getLength(){
        return string.length();
    }
    public int getWords(){
        String[] words = string.split(" ");
        return words.length;
    }
    public String concat(String stringToConcat){
        return string+stringToConcat;
    }
    public boolean isPalindrome(){
        StringBuilder reverse = new StringBuilder();
        reverse.append(string);
        reverse.reverse();
        return string.equals(reverse.toString());
        
    } 
    Scanner sc = new Scanner(System.in);
    public void Input(){
        System.out.print("Input a string: ");
        string = sc.nextLine();
    }
}

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
public class Question2 {
        private int a;
        private int b;
        private int c;

    public Question2() {
    }
    
    public Question2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int MinimumNumber(){
        return Math.min(Math.min(a, b), c);
    }
    Scanner sc = new Scanner(System.in);
    public void Input(){
        System.out.print("Input 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
}

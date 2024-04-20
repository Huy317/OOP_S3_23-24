/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

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
}

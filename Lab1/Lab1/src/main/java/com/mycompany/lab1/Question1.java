/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question1 {
    private int number;

    public Question1() {
    }
    public Question1(int number) {
        this.number = number;
    }
    public int SumFirstLastDigit(){
        int lastDigit = number%10;
        int firstDigit = number;
        while (firstDigit>10){
            firstDigit/=10;
        }
        return lastDigit + firstDigit;
        
    }
}

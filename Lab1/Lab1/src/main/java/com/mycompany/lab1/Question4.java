/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question4 {
    private int[] arr;

    public Question4() {
    }

    public Question4(int[] arr) {
        this.arr = arr;
    }
    public int SumEvenNumbers(){
        int sum = 0;
        for (int i:arr){
            if (i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
}

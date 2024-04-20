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
    Scanner sc = new Scanner(System.in);
    public void Input(){
        System.out.print("Input size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("Input number: ");
            arr[i] = sc.nextInt();
        }
    }
}

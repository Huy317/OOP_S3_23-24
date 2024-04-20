/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question5 {
    private ArrayList<Integer> arrlist = new ArrayList<>();
    
    public Question5() {
    }

    public Question5(ArrayList<Integer> arrlist) {
        this.arrlist = arrlist;
    }
    
    public boolean RemoveFirstSpecific(int n){
        if (arrlist.contains(n)==false){
            return false;
        }
        for (int i = 0; i < arrlist.size();i++){
            if (n == arrlist.get(i)){
                arrlist.remove(i);
                break;
            }
        }
        return true;
    }
    public void InsetToPosition(int n, int pos){
        int curr = arrlist.get(pos);
        arrlist.remove(pos);
        arrlist.add(pos,n);
        arrlist.remove(arrlist.size()-1);
        arrlist.add(curr);
    }
    private int FindMaxValue(){
        int max = arrlist.get(0);
        for (int i = 0; i<arrlist.size();i++){
            if (arrlist.get(i)>max){
                max = arrlist.get(i);
            }
        }
        return max;
    }
    public ArrayList FindDuplicate(){
        ArrayList<Integer> duplicate = new ArrayList<>();
        int[] counter = new int[FindMaxValue()+1];
        for (int i = 0; i<arrlist.size();i++){
            counter[arrlist.get(i)] += 1;
            //System.out.println(arrlist.get(i)+"="+counter[arrlist.get(i)]);
        }
        
        for (int i = 0;i<counter.length;i++){
            if (counter[i] > 1){
                for (int v = 1;v<=counter[i]-1;v++){
                    duplicate.add(i);
                }
                //System.out.println(i+"="+counter[i]);
            }
        }
        //OutputArray(duplicate);
        return duplicate;
    }
    
    public void RemoveDuplicate(){
        ArrayList<Integer> duplicate = FindDuplicate();
        for (int i = 0; i<duplicate.size();i++){
            arrlist.remove(arrlist.indexOf(duplicate.get(i)));
        }
        //OutputArray(arrlist);
    }
    
    Scanner sc = new Scanner(System.in);
    public void Input(){
        System.out.print("Input size of array: ");
        int n = sc.nextInt();
        for (int i = 0; i<n;i++){
            System.out.print("Input number: ");
            arrlist.add(sc.nextInt());
        }
        
    }
    public void Output(){
        for (int i = 0; i<arrlist.size();i++){
            System.out.print(arrlist.get(i)+" ");
        }
    }
    public void OutputArray(ArrayList arr){
        for (int i = 0; i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}

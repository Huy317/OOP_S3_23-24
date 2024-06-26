/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Lab1 {

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.Input();
        System.out.println(q1.SumFirstLastDigit());

        Question2 q2 = new Question2();
        q2.Input();
        System.out.println(q2.MinimumNumber());

        Question3 q3 = new Question3();
        q3.Input();
        q3.HailstoneSequence();

        Question4 q4 = new Question4();
        q4.Input();
        System.out.println(q4.SumEvenNumbers());

        Question5 q5 = new Question5();
        q5.Input();
        System.out.println(q5.RemoveFirstSpecific(5));
        q5.InsertToPosition(10, 2);
        q5.OutputArray(q5.FindDuplicate());
        q5.RemoveDuplicate();
        q5.Output();

        Question6 q6 = new Question6();
        q6.Input();
        System.out.println(q6.getLength());
        System.out.println(q6.getWords());
        System.out.println(q6.concat(" alo123"));
        System.out.println(q6.isPalindrome());

    }
}

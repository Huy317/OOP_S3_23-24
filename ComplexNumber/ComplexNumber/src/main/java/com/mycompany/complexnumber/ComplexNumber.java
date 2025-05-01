/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complexnumber;

/**
 *
 * @author Student
 */
public class ComplexNumber {

    public static void main(String[] args) {
        Complex a = new Complex();
        a.InputComplex();
        Complex b = new Complex();
        b.InputComplex();
        a.plus(b).print();
        a.minus(b).print();
        a.multiply(b).print();
        a.division(b).print();
    }
}

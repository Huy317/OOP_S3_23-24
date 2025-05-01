/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complexnumber;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex() {
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    public double getIm() {
        return im;
    }
    
    public Complex plus(Complex num){
        Complex a = new Complex();
        a.setRe(this.re+num.getRe());  
        a.setIm(this.im+num.getIm());
        return a;
    }
    public Complex minus(Complex num){
        Complex a = new Complex();
        a.setRe(this.re-num.getRe());
        a.setIm(this.im-num.getIm());
        return a;
    }
    public Complex multiply(Complex num){
        Complex a = new Complex();
        a.setRe(this.re*num.getRe() - this.im*num.getIm());
        a.setIm(this.re*num.getIm() + this.im*num.getRe());
        return a;
    }
    public Complex division(Complex num){
        Complex a = new Complex();
        a.setRe((this.re*num.getRe() + this.im*num.getIm())/(num.getRe()*num.getRe()+num.getIm()*num.getIm()));
        a.setIm((this.im*num.getRe() - this.re*num.getIm())/(num.getRe()*num.getRe()+num.getIm()*num.getIm()));
        return a;
    }
    public void InputComplex(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Real: ");
        re = sc.nextDouble();
        System.out.print("imaginary: ");
        im = sc.nextDouble();
    }
    public void print(){
        if (im >=0){
            System.out.println(re+"+"+im+"i");
        }else{
            System.out.println(re+""+im+"i");
        }
        
    }
    
}

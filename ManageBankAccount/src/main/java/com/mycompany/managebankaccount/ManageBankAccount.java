/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.managebankaccount;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ManageBankAccount {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          ArrayList<BankAccount> accList = new ArrayList<>();
          int n = sc.nextInt();
          for (int i = 0; i < n; i++){
              BankAccount newAcc = new BankAccount();
              newAcc.Input();
              accList.add(newAcc);
          }
          for (int i = 0; i<n;i++){
              accList.get(i).print();
          }
          System.out.print("Account number to deposit: ");
          int num = sc.nextInt();
          boolean found = false;
          for (BankAccount i : accList){
              if (num == i.getAccNum()){
                  System.out.print("Enter deposit amount: ");
                  double money = sc.nextDouble();
                  i.deposit(money);
                  found = true;
                  break;
              }
          }
          if (!found){
              System.out.println("Couldn't find account number");
          }
          
          System.out.print("Account number to withdraw: ");
          num = sc.nextInt();
          found = false;
          for (BankAccount i : accList){
              if (num == i.getAccNum()){
                  System.out.print("Enter withdraw amount: ");
                  double money = sc.nextDouble();
                  if (i.withdraw(money) == true){
                      System.out.println("Withdrawal Successful");
                  }else{
                      System.out.println("Withdrawal Unsuccessful");
                  }
                  found = true;
                  break;
              }
          }
          if (!found){
              System.out.println("Couldn't find account number");
          }
          
          System.out.print("Choose an account number to do the transfer: ");
          num = sc.nextInt();
          int i1 = 0;
          for (int i = 0; i<n;i++){
              if ((num == accList.get(i).getAccNum())){
                  i1 = i;
                  break;
              }
          }
          System.out.print("Choose an account number to receive the transfer: ");
          num = sc.nextInt();
          int i2 = 0;
          for (int i = 0; i<n;i++){
              if ((num == accList.get(i).getAccNum())){
                  i2 = i;
                  break;
              }
          }
          System.out.print("Enter money to transfer: ");
          double money = sc.nextDouble();
          
          if (accList.get(i1).transferMoney(accList.get(i2), money) == true){
              System.out.println("Transfer Successful");
          }else{
              System.out.println("Transfer Unsuccessful");
          }
          
          accList.get(i1).print();
          accList.get(i2).print();
    }
}

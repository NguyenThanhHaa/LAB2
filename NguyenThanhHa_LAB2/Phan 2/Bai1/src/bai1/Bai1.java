/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author thanh ha
 */

import java.util.Scanner;
import java.lang.Math;
public class Bai1 {

   
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Nhap so n vao: ");
       int n = input.nextInt();
       
       double cb2 = (double) Math.sqrt(n);
       
       if (cb2 == (int) cb2)
       {
           System.out.printf("%d la so chinh phuong\n",n);
       }
       
       else 
        System.out.printf("%d khong la so chinh phuong\n",n);
}
}

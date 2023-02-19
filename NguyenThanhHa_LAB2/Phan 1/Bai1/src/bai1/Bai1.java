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
public class Bai1 {
    
    
    public static void GiaiPTB1()
    {    
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.print("Nhap a = ");
        a = input.nextDouble();
        System.out.print("Nhap b = ");
        b = input.nextDouble();
        if (a==0)
        {
            if (b==0)
                System.out.println("Phuong trinh vo so nghiem");
            
            else 
                 System.out.println("Phuong trinh vo nghiem");
        }
        
        else 
            System.out.println("Phuong trinh co nghiem duy nhat: x= " +(-b/a));
    }
    
    
    public static void main(String[] args) {
      GiaiPTB1();
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author thanh ha
 */
public class Bai2 {

    public static void GiaiPTB2()
    {   
        Scanner input = new Scanner(System.in);
        double a, b, c, delta;
        System.out.print("Nhap a= ");
        a = input.nextDouble();
        System.out.print("Nhap b= ");
        b = input.nextDouble();
        System.out.print("Nhap c= ");
        c = input.nextDouble();
        
        if (a==0)
      {
          if (b==0)
          {
              if (c==0)
                  System.out.println("Phuong trinh vo so nghiem");
              
              else
                  System.out.println("Phuong trinh vo nghiem");
          }
          
          else 
              System.out.println("Phuong trinh co nghiem: x = " +(-c/b));
          
      }
      
      else
      {
          delta = (b*b) - (4*a*c);
          double candelta = Math.sqrt(delta);
          
          if (delta==0)
          {
              System.out.println("Phuong trinh co nghiem kep: x1 = x2 = "+(-b/(2*a)));
          }
          
          else if (delta>0)
          {
              System.out.println("Phuong trinh co 2 nghiem phan biet: \nx1 = " +((-b+candelta)/(2*a))+ "\nx2 = " +((-b-candelta)/(2*a)));
          }
          
          else 
              System.out.println("Phuong trinh vo nghiem");
    }
    }
    
    public static void main(String[] args) 
    {
      GiaiPTB2();
    }
    
}

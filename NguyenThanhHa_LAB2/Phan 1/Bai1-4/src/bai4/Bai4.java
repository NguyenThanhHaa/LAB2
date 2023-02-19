/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.Scanner;
import java.lang.Math;
public class Bai4 {

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
   
   public static void Tinhtiendien()
    {   double sokwh, tiendien;
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nhap So Kwh: ");
        sokwh = input.nextDouble();
        
        
        if (sokwh<=50)
       {
           tiendien = sokwh * 1000;
       }
       
       else
       {
           tiendien = (sokwh*1000) + (sokwh-50)*1200; 
       }
        
        System.out.println("Tien dien la: " +tiendien); 
     
    }
    
    
    public static void main(String[] args) 
    {   
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giai phuong trinh bac 1");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        System.out.println("4. Ket thuc");
        System.out.println("+---------------------------------------------------+");
        
        
        int chon;
        Scanner input = new Scanner(System.in);
        System.out.print("Chon chuc nang: ");
        chon = input.nextInt();
        
        switch (chon) {
            case 1:
                System.out.println("Giai phuong trinh bac 1: ");
                GiaiPTB1();
                break;

            case 2:
                System.out.println("Giai phuong trinh bac 2: ");
                GiaiPTB2();
                break;

            case 3:
                System.out.println("Tinh tien dien:");
                Tinhtiendien();
                break;

            default:
                System.out.println("Vui long chon lai");
                break;
        }

}
}

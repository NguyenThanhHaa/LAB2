/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

/**
 *
 * @author thanh ha
 */
import java.util.Scanner;
public class Bai3 {

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
        Tinhtiendien();
}
    
}

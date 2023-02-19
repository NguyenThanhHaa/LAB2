/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

/**
 *
 * @author thanh ha
 */

import java.util.Scanner;
public class Bai2 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap diem trung binh: ");
        double dtb = input.nextDouble();
        
        if (dtb<5.0)
        {
            System.out.println("Xep loai kem");
        }
        
        else if (dtb>5.0 && dtb <7.0)
        {
            System.out.println("Xep loai trung binh");
        }
        
        else if (dtb >7.0 && dtb<8.0)
        {
            System.out.println("Xep loai kha");
        }
        
        else
            System.out.println("Xep loai gioi");
    }
    
}

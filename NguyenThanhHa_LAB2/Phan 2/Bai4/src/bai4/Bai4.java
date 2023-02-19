/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

/**
 *
 * @author thanh ha
 */

import java.util.Scanner;
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Nhap so nguyen n: ");
        int n = input.nextInt();
        
        int i=1;
        long gt=1;
        
        while (i<=n)
        {  
            gt = gt * i;
            i++; 
            
        }
        
        System.out.printf("Giai thua cua %d la: %d\n",n,gt);
    }
    
}

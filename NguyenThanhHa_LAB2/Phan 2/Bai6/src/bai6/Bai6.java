/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

/**
 *
 * @author thanh ha
 */

import java.util.Scanner;
public class Bai6 {
    
  
    public static void main(String[] args) 
    {
        int n;  
        int k = 0;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Nhap so bac cua ma tran: ");
            n = input.nextInt();
        } while (n < 1);

        int[][] a = new int[n][n];
        
        System.out.println("Nhap cac phan tu cua ma tran: ");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print("a[" + i + "," + j + "] = ");
                a[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Ma tran vua nhap la:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + "\t");
            }

        System.out.println("\n");
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (a[i][j] == a[j][i]) 
                    k = 1; 
                else 
                    k = 0;
            }
        }

        if (k == 1) 
        {
            System.out.println("La ma tran doi xung");
        } 
        
        else 
        {
            System.out.println("Khong la ma tran doi xung");
        }

    }

}

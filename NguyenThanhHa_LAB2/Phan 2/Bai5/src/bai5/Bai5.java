/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;

/**
 *
 * @author thanh ha
 */

import java.util.Scanner;
public class Bai5 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int n, del;
        int count = 0;
        int temp;
        
        do{
            System.out.print("Nhap so luong phan tu: ");
            n = input.nextInt();
            if(n<0){
                 System.out.println("Vui long nhap lai: ");
            }
        }
        while(n<0);
        
        int[] a = new int [n];
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("a[" + i + "] =  ");
            a[i] = input.nextInt();
        }
        
        System.out.println("Sap xep mang theo thu tu tang dan: ");
        for (int i=0;i<n;i++)
        {
            for(int j=n-1;j>i+1;j--)
            {
                if(a[i]>a[j])
                {
                    temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nNhap phan tu muon xoa:  ");
        del = input.nextInt();
        
        for (int i = 0; i < n; i++) 
        {
            if (a[i] == del) 
            {
                for (int j = i; j < (n - 1); j++) 
                {
                    a[j] = a[j + 1];
                }
                
                count++;
                break;
            }
        }
        
        if (count == 0) 
        {
            System.out.print("Vui long nhap lai: ");
        }
        
        else 
        {
            System.out.println("Mang sau khi xoa: ");
            for (int i = 0; i < (n - 1); i++) 
            {
                System.out.print(a[i] + " ");
            }
        }  
}
}


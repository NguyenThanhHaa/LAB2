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
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Nhap n: ");
        int n = input.nextInt();

        int a = n % 10;   //Don vi
        int b = (n / 10) % 10;  //Chuc
        int c = n / 100; //Tram
                
        if (n < 100 || n > 999) {
            System.out.printf("Nhap lai so co ba chu so: ");
        } else {

            switch (c) 
            {
                case 1:
                    System.out.printf("Mot tram ");
                    break;
                case 2:
                    System.out.printf("Hai tram ");
                    break;
                case 3:
                    System.out.printf("Ba tram ");
                    break;
                case 4:
                    System.out.printf("Bon tram ");
                    break;
                case 5:
                    System.out.printf("Nam tram ");
                    break;
                case 6:
                    System.out.printf("Sau tram ");
                    break;
                case 7:
                    System.out.printf("Bay tram ");
                    break;
                case 8:
                    System.out.printf("Tam tram ");
                    break;
                case 9:
                    System.out.printf("Chin tram ");
                    break;
            }

            if (b % 10 == 0 && a != 0) 
            {
                System.out.printf("le ");
            }

            switch (b) 
            {
                case 1:
                    System.out.printf("muoi ");
                    break;
                case 2:
                    System.out.printf("hai muoi ");
                    break;
                case 3:
                    System.out.printf("ba muoi ");
                    break;
                case 4:
                    System.out.printf("bon muoi ");
                    break;
                case 5:
                    System.out.printf("nam muoi ");
                    break;
                case 6:
                    System.out.printf("sau muoi ");
                    break;
                case 7:
                    System.out.printf("bay muoi ");
                    break;
                case 8:
                    System.out.printf("tam muoi ");
                    break;
                case 9:
                    System.out.printf("chin muoi ");
                    break;
            }

            switch (a) 
            {
                case 1:
                    System.out.printf("mot ");
                    break;
                case 2:
                    System.out.printf("hai ");
                    break;
                case 3:
                    System.out.printf("ba ");
                    break;
                case 4:
                    System.out.printf("bon ");
                    break;
                case 5:
                    System.out.printf("lam ");
                    break;
                case 6:
                    System.out.printf("sau ");
                    break;
                case 7:
                    System.out.printf("bay ");
                    break;
                case 8:
                    System.out.printf("tam ");
                    break;
                case 9:
                    System.out.printf("chin ");
                    break;
            }
        }
    }
}
    


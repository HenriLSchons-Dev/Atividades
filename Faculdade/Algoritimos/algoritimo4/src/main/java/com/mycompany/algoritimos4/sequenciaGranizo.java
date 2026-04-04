/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimos4;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class sequenciaGranizo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passos = 0;

        for (; n != 1; passos++) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        System.out.println("1");
        System.out.println("Passos: " + passos);
    }
}
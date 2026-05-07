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
public class conversaoBases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int binario = 0, base = 1;

        for (; num > 0;) {
            int resto = num % 2;
            binario = binario + resto * base;
            base = base * 10;
            num = num / 2;
        }

        System.out.println(binario);
    }
}

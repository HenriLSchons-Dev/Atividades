/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo5;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class filtroPositivos {

    public static void main(String[] args) {
        int num, certo = -1;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            certo++;
        }while(num >= 0);
        
        System.out.println("Voce digitou " + certo + " numeros certos.");
    }
}
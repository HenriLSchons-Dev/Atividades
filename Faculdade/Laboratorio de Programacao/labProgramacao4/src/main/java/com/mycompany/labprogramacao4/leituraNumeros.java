/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.labprogramacao4;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class leituraNumeros {

    public static void main(String[] args) {
        int i = 1, num;
        Scanner leia = new Scanner(System.in);
        
        while(i <= 5){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            System.out.println("Voce digitou: " + num);
            i++;
        }
    }
}
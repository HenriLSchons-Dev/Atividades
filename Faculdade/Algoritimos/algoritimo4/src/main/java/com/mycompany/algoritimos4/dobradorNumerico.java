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
public class dobradorNumerico {

    public static void main(String[] args) {
        int num, dobro;
        Scanner leia = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            dobro = num * 2;
            System.out.println("O dobro do seu numero é: " + dobro);
        }
    }
}
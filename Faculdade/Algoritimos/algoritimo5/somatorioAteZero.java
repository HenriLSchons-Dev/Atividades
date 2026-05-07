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
public class somatorioAteZero {

    public static void main(String[] args) {
        int num = 1, soma = 0;
        Scanner leia = new Scanner(System.in);
        
        
        while(num != 0){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            soma = (soma + num);
            System.out.println("A soma desses nuemros é igual a: " + soma);
        }
    }
}

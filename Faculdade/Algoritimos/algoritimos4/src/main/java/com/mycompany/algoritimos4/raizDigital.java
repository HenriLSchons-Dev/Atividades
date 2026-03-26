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
public class raizDigital {

    public static void main(String[] args) {
        int num, digito, soma = 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = leia.nextInt();
        for(;num >= 10;){
            soma = 0;
            
            for(int limite = num; limite > 0; limite = limite / 10){
                digito = limite % 10;
                soma = soma + digito;
            }
            num = soma;
        }
        
        System.out.println(soma);
    }
}
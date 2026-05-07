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
public class assinaturaNumerica {

    public static void main(String[] args) {
        int num, soma = 0, posicao = 1, digito;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = leia.nextInt();

        while (num >= 10) {

            while (num > 0) {
                digito = num % 10;
                soma = soma + digito * posicao;

                num = num / 10;
                posicao++;
            }

            num = soma;
        }

        System.out.println("A assinatura numerica do seu numero é: " + num);
    }
}

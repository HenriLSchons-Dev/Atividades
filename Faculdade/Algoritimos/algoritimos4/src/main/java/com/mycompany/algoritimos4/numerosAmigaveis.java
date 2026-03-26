/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimos4;

/**
 *
 * @author Henri Lopes Schons
 */
public class numerosAmigaveis {

    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            int soma = 0;

            for (int limite = i; limite > 0; limite = limite / 10) {
                int digito = limite % 10;
                soma = soma + (digito * digito * digito);
            }

            if (soma == i) {
                System.out.println(i);
            }
        }
    }
}
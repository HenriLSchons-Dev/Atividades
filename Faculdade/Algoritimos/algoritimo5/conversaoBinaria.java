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
public class conversaoBinaria {

    public static void main(String[] args) {
        int binario, decimal = 0, potencia = 1,  digito;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero em binario: ");
        binario = leia.nextInt();

        while (binario > 0) {
            digito = binario % 10;

            decimal = decimal + digito * potencia;

            potencia = potencia * 2;
            binario = binario / 10;
        }

        System.out.println("A conversao para base decimal é: " + decimal);
    }
}

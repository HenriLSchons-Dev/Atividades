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
public class josephusSimples {

    public static void main(String[] args) {
        int num, potencia = 1, resultado;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva um numero: ");
        num = leia.nextInt();

        while (potencia * 2 <= num) {
            potencia = potencia * 2;
        }

        resultado = 2 * (num - potencia) + 1;

        System.out.println(resultado);
    }
}

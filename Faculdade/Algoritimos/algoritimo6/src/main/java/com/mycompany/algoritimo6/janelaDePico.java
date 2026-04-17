/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class janelaDePico {

    public static void main(String[] args) {
        int[] consumo = {2, 3, 1, 2, 4, 3};
        int i, inicio = 0, soma = 0, minTam = 0, critico = 7;
        boolean encontrou = false;

        for (i = 0; i < consumo.length; i++) {
            soma = soma + consumo[i];

            while (soma >= critico) {
                int tamanho = i - inicio + 1;

                if (!encontrou || tamanho < minTam) {
                    minTam = tamanho;
                    encontrou = true;
                }

                soma = soma - consumo[inicio];
                inicio++;
            }
        }

        if (!encontrou) {
            System.out.println("Não existe subvetor válido");
        } 
        else {
            System.out.println("Menor tamanho: " + minTam);
        }
    }
}

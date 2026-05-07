/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class triagemCache {

    public static void main(String[] args) {
        int[] vetor = {3, 8, 5, 2, 7, 6};
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda < direita) {

            if (vetor[esquerda] % 2 == 0) {
                esquerda++;
            } 
            else if (vetor[direita] % 2 != 0) {
                direita--;
            } 
            else {
                int temp = vetor[esquerda];
                vetor[esquerda] = vetor[direita];
                vetor[direita] = temp;
                esquerda++;
                direita--;
            }
        }

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

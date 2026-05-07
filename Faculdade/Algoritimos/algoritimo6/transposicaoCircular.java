/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class transposicaoCircular {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int i, k = 2, j, ultimo;

        for (i = 0; i < k; i++) {
            ultimo = vetor[vetor.length - 1];

            for ( j = vetor.length - 1; j > 0; j--) {
                vetor[j] = vetor[j - 1];
            }

            vetor[0] = ultimo;
        }

        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class anomaliasDePico {

    public static void main(String[] args) {
        int[] vetor = {5, 10, 3, 8, 2};
        int esquerda, direita;
        
        for (int i = 0; i < vetor.length; i++) {
            esquerda = (i - 1 + vetor.length) % vetor.length;
            direita = (i + 1) % vetor.length;

            if (vetor[i] > vetor[esquerda] && vetor[i] > vetor[direita]) {
                System.out.println("Pico no índice: " + i);
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;
/**
 *
 * @author Henri Lopes Schons
 */
public class somatorioVetor {

    public static void main(String[] args) {
        int i, soma = 0;
        int[] vetor = {10, 20, 30, 40, 50};
        
        for(i = 0; i < vetor.length; i++){
            soma = vetor[i] + soma;
        }
        System.out.println("A soma de todos esses numeros é: " + soma);
    }
}

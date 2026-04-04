/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimos4;

/**
 *
 * @author Henri Lopes Schons
 */
public class somatorio {

    public static void main(String[] args) {
        int somaTotal = 0;
        for (int i = 1; i <= 10; i++){
            somaTotal = somaTotal + i;
            System.out.println(i);
        }
        System.out.println("A soma total foi de: " + somaTotal);
    }
}
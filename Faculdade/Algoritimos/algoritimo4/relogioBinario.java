/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimos4;

/**
 *
 * @author Henri Lopes Schons
 */
public class relogioBinario {

    public static void main(String[] args) {
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {

                int somaH = (h / 10) + (h % 10);
                int somaM = (m / 10) + (m % 10);

                if (somaH == somaM) {
                    System.out.println(h + ":" + m);
                }
            }
        }  
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class autonomiaSaltos {

    public static void main(String[] args) {
        int[] movimento = {2, 3, 1, 1, 4};

        int i, saltos = 0, alcance = 0, maxAlcance = 0;

        for (i = 0; i < movimento.length - 1; i++) {
            if (i + movimento[i] > maxAlcance) {
                maxAlcance = i + movimento[i];
            }

            if (i == alcance) {
                saltos++;
                alcance = maxAlcance;

                if (alcance <= i) {
                    System.out.println("Inalcansável");
                }
            }
        }

        System.out.println("Saltos mínimos: " + saltos);
    }
}

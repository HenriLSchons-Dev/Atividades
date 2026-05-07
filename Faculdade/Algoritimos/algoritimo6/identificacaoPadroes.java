/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class identificacaoPadroes {

    public static void main(String[] args) {
        int[] ids = {1, 2, 1, 3, 2, 1, 4, 2, 2, 5};
        int[] cont = new int[ids.length];
        int i, j, contador;
        
        for (i = 0; i < ids.length; i++) {
            contador = 0;

            for (j = 0; j < ids.length; j++) {
                if (ids[i] == ids[j]) {
                    contador++;
                }
            }

            if (contador > 3) {
                cont[i] = 0;
            } else {
                cont[i] = contador;
            }
        }

        for (int num : cont) {
            System.out.print(num + "; ");
        }
    }
}

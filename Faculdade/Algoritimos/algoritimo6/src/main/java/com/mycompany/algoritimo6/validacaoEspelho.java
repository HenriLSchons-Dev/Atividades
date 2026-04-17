/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class validacaoEspelho {

    public static void main(String[] args) {
        int i, w = 0, dobro;
        int[] mirror = {2, 4, 6, 8, 10, 12, 6, 5, 4, 3, 2, 1};
        Scanner leia = new Scanner(System.in);
        
        for(i = mirror.length - 1; i >= 0; i--){
            dobro = mirror[i] * 2;
            if(dobro == mirror[w]){
                System.out.println("Espelho encontrado!");
            }
            w++;
        }
     }
}

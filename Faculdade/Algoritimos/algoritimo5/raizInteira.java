/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo5;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class raizInteira {

    public static void main(String[] args) {
        int num, impar = 1, cont = 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero para saber sua raiz: ");
        num = leia.nextInt();

        while (num != 0) {
            num = num - impar;
            impar = impar + 2;
            cont++;
        }

        if (num == 0) {
            System.out.println("Raiz: " + cont);
        } else {
            System.out.println("Não é quadrado perfeito");
        }
    }
}

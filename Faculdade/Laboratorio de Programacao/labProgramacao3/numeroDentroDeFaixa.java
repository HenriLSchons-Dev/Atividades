/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorioprogramacao;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class numeroDentroDeFaixa {

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero para verificar se ele esta presente entre 20 e 50");
        num = leia.nextInt();
        
        if(num <= 50){
            if(num >= 20) {
                System.out.println("Seu numero esta entre 20 e 50");
            }
        }
        else {
            System.out.println("Seu numero nao esta entre 20 e 50");
        }
    }
}

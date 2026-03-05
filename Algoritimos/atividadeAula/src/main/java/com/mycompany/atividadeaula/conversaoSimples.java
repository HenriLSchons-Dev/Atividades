/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividadeaula;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class conversaoSimples {

    public static void main(String[] args) {
        double conversao;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos metros deseja converter para centimetros? ");
        double medida = leia.nextDouble();
        
        conversao = medida * 100;
        System.out.println("O resultado da conversao para centimetros e: " + conversao);
    }
}

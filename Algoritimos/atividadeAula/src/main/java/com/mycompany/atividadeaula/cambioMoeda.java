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
public class cambioMoeda {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double doll;
        
        System.out.println("Quantos reais voce possui?");
        double reais = leia.nextDouble();
        
        doll = reais / 5;
        
        System.out.println("O cambio para dolares do seu patrimonio e de: " + doll);
    } 
}

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
public class dobroMetade {

    public static void main(String[] args) {
        double dobro, metade;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        double num = leia.nextDouble();
        
        dobro = num * 2;
        metade = num / 2;
        
        System.out.println("A metade: " + metade);
        System.out.println("O dobro: " + dobro);
    }
    
}

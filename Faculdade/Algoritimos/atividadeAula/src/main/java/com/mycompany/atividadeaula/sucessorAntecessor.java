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
public class sucessorAntecessor {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int sucessor, antecessor;
        
        System.out.println("Digite um numero para saber seu sucessor e seu antecessor: ");
        int numero = num.nextInt();
        
        sucessor = numero + 1;
        antecessor = numero - 1;
        
        System.out.println("O sucessor desse numero e " + sucessor + ", ja o antecessor e " + antecessor);
    }
}

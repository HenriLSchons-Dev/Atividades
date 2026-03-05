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
public class diasVividos {

    public static void main(String[] args) {
        int dias;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos naos voce tem?");
        int idade = leia.nextInt();
        
        dias = idade * 365;
        
        System.out.println("Voce viveu um total de: " + dias);
    } 
}

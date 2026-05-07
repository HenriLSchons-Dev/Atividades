/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class calculoPremiacao {

    public static void main(String[] args) {
        int volume, vendas;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o volume de vendas do vendedor possui?");
        volume = leia.nextInt();
        
        System.out.println("Quantos itens vendidos?");
        vendas = leia.nextInt();
        
        if(volume > 100000){
            System.out.println("Bonus de 10%");
        }
        else if(volume > 50000 && vendas >= 10){
            System.out.println("Bonus de 5%");
        }
        else if(volume > 50000 && vendas < 10){
            System.out.println("Bonus de 2%");
        }
        else {
            System.out.println("Sem bonus salarial");
        }
    }
}
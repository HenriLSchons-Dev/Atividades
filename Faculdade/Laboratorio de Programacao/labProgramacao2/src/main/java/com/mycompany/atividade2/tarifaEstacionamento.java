/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade2;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class tarifaEstacionamento {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quanto tempo em horas o estacionamento foi utilizado?");
        int tempo = leia.nextInt();
        
        if(tempo > 6){
            System.out.println("Valor a pagar: 20 reais");
        }
        else if (tempo > 3){
            System.out.println("Valor a pagar: 15 reais");
        }
        else if(tempo > 1){
            System.out.println("Valor a pagar: 10 reais");
        }
        else{
            System.out.println("Valor a pagar: 5 reais");
        }
    }
}
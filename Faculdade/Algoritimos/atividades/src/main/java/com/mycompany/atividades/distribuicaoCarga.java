/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class distribuicaoCarga {

    public static void main(String[] args) {
        int peso;
        boolean destino;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o peso do produto em quilos?");
        peso = leia.nextInt();
        
        System.out.println("O produto vai pra fora do país?");
        destino = leia.nextBoolean();
        
        if(destino == true && peso >= 50){
            System.out.println("O custo para envio é de R$500");
        }
        else if(destino == true && peso < 50){
            System.out.println("O custo para envio é de R$300");
        }
        else{
            System.out.println("O custo para envio é gratuito");
        }
    }
}

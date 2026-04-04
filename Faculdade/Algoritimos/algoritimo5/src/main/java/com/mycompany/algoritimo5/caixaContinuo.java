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
public class caixaContinuo {

    public static void main(String[] args) {
        int cliente;
        float saldo, saque;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite o valor do seu saldo atual:");
        saldo = leia.nextFloat();
        
        System.out.println("Quanto deseja sacar?");
        saque = leia.nextFloat();
        
        if(saldo >= saque){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Falha ao sacar, saldo insuficiente!");
        }
        
        System.out.println("Novo cliente se aproximando? 1-Sim : 2-Nao");
        cliente = leia.nextInt();
        
        }while(cliente != 0);
        
        System.out.println("Nenhum cliente se aproximando, desligando caixa");
    }
}
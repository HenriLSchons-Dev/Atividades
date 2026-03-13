/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimosaula2;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class levantamentoMultibanco {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o valor do seu saldo atual:");
        float saldo = leia.nextFloat();
        
        System.out.println("Quanto deseja sacar?");
        float saque = leia.nextFloat();
        
        if(saldo >= saque){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Falha ao sacar, saldo insuficiente!");
        }
    }
}
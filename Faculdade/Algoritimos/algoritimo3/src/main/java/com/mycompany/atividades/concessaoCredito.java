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
public class concessaoCredito {

    public static void main(String[] args) {
        int idade;
        double renda;
        boolean fiador;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos anos tem o cliente?");
        idade = leia.nextInt();
        
        System.out.println("Qual a renda do cliente?");
        renda = leia.nextDouble();
        
        System.out.println("O cliente possui um fiador cadastrado?");
        fiador = leia.nextBoolean();
        
        if(idade >= 21 && renda >= 3000){
            System.out.println("Emprestimo aprovado!");
        }
        else if(fiador == true){
            System.out.println("Emprestimo aprovado por ter um fiador cadastrado.");
        }
        else {
            System.out.println("Emprestimo negado.");
        }
    }
}

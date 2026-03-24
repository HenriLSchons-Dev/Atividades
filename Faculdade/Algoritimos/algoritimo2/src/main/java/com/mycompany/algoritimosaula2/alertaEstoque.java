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
public class alertaEstoque {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a quantidade desse produto na loja?");
        int quantidade = leia.nextInt();
        
        if(quantidade < 5){
            System.out.println("Aviso: Necessario repor estoque");
        }else{
            System.out.println("Estoque adequado!");
        }
    }
}
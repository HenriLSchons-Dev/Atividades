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
public class descontoProgressivo {

    public static void main(String[] args) {
        double valor, desconto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual foi o valor total da sua compra?");
        valor = leia.nextDouble();
        
        if(valor >= 1000){
            desconto = valor * 1.20;
            System.out.println("Total a se pagar: " + desconto);
        }
        else if(valor >= 500){
            desconto = valor * 1.10;
            System.out.println("Total a se pagar: " + desconto);
        }
        else if(valor >= 100){
            desconto = valor *1.05;
            System.out.println("Total a se pagar: " + desconto);
        }
        else {
            System.out.println("Total a se pagar: " + valor);
        }
    }
}
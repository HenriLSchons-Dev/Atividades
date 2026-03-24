/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorioprogramacao;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class descontoCompra {

    public static void main(String[] args) {
        int compra;
        double desconto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor da sua compra?");
        compra = leia.nextInt();
        
        if(compra >= 200){
            desconto = compra * 1.10;
            System.out.println("O valor final da sua compra com desconto é de: " + desconto);
        }
        else {
            System.out.println("O valor final da sua compra, sem desconto, é de: " + compra);
        }
    } 
}
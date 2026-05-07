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
public class validacaoCupom {

    public static void main(String[] args) {
        double compra, valor;
        boolean liquidacao, vip;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor da compra?");
        compra = leia.nextDouble();
        
        System.out.println("O cliente possui o status de VIP?");
        vip = leia.nextBoolean();
        
        System.out.println("O produto esta em liquidacao?");
        liquidacao = leia.nextBoolean();
        
        if(compra > 200 || vip == true && liquidacao == false){
            valor = compra * 1.15;
            System.out.println("Valor final com desconto é de: " + valor);
        }
        else {
            System.out.println("Sem desconto para esse cliente. Valor final de: " + compra);
        }
    }
}
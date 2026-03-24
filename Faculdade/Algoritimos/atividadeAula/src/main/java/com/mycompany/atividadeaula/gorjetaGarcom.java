/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividadeaula;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class gorjetaGarcom {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double bill;
        
        System.out.println("Qual é o valor da conta a pagar?");
        double conta = leia.nextDouble();
        
        bill = conta * 0.1;
        
        System.out.println("O valor final da sua conta, incluindo a gorjeta de 10% para o garcom e de: " + bill);
    }
    
}

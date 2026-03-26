/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimos4;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class tabuadaLonga {

    public static void main(String[] args) {
        int num;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número para a tabuada: ");
        num = leitor.nextInt(); 
        
        for (int i = 1; i <= 100; i++) {
            
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
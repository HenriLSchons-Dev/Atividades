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
public class impostoProgressivo {

    public static void main(String[] args) {
        double rendimento, imposto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor do seu rendimento?");
        rendimento = leia.nextDouble();
        
        if (rendimento < 10000){
            System.out.println("Voce esta isento de impostos.");
        }
        else if (rendimento < 20000){
            imposto = rendimento * 1.10;
            System.out.println("Seu rendimento mais 10% de imposto: " + imposto);
        }
        else if (rendimento < 50000){
            imposto = rendimento * 1.20;
            System.out.println("Seu rendimento mais 20% de imposto: " + imposto);
        }
        else {
            imposto = rendimento * 1.30;
            System.out.println("Seu rendimento mais 30% de imposto: " + imposto);
        }
    } 
}

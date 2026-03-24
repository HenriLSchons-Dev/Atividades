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
public class salarioSimples {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double salario;
        
        System.out.println("Quanto voce ganha por hora?");
        double honorario = leia.nextDouble();
        
        System.out.println("Quantas horas voce trabalhou?");
        int horas = leia.nextInt();
        
        salario = honorario * horas;
        
        System.out.println("Seu salario final e de: " + salario);
    }
}

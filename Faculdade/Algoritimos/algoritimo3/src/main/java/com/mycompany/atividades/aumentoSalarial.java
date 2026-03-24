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
public class aumentoSalarial {

    public static void main(String[] args) {
        double salario, aumento;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o salario do funcionario?");
        salario = leia.nextDouble();
        
        if(salario < 1000){
            aumento = salario * 1.15;
            System.out.println("Seu salario mais um aumento de 15% é de: " + aumento);
        }
        else if(salario < 2000){
            aumento = salario * 1.10;
            System.out.println("Seu salario amis um aumento de 10% é de: " + aumento);
        }
        else {
            aumento = salario * 1.05;
            System.out.println("Seu salario mais um aumento de 5% é de: " + aumento);
        }
    } 
}

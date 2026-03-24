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
public class calcIMC {

    public static void main(String[] args) {
        double peso, altura, calc;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual sua altura?");
        altura = leia.nextDouble();
        
        System.out.println("Qual seu peso?");
        peso = leia.nextDouble();
        
        calc = peso / (altura * altura);
        
        if(calc < 18.5){
            System.out.println("Abaixo do peso ideal");
        }
        else if(calc < 25){
            System.out.println("No peso ideal");
        }
        else{
            System.out.println("Acima do peso, sobrepeso");
        }
    }
}
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
public class calculadoraIMC {

    public static void main(String[] args) {
        double imc;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a sua altura?");
        double altura = leia.nextDouble();
        
        System.out.println("Qual o seu peso?");
        double peso = leia.nextDouble();
        
        imc = peso / (altura * altura);
        
        if(imc >= 25){
            System.out.println("Voce esta acima do peso!");
        }else{
            System.out.println("Voce esta no seu peso ideal!");
        }
    }
}
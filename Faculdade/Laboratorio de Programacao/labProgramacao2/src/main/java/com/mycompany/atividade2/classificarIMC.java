/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade2;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class classificarIMC {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o seu IMC?");
        int imc = leia.nextInt();
        
        if(imc < 0){
            System.out.println("Insira um valor valido da proxima vez!");
        }
        else if(imc > 30){
            System.out.println("Obeso.");
        }
        else if(imc >= 25){
            System.out.println("Acima do peso ideal.");
        }
        else if(imc > 18.5){
            System.out.println("Peso ideal.");
        }
        else{
            System.out.println("Abaixo do peso");
        }
    }
}
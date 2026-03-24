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
public class maiorEntreTres {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        num2 = leia.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        num3 = leia.nextInt();
        
        if(num1 > num2){
            if(num1 > num3){
                if(num2 > num3){
                    System.out.println("A sequencia no maior pro menor é: " + num1 + num2 + num3);
                }
                else {
                    System.out.println("A sequencia do maior pro menor é: " + num1 + num3 + num2);
                }
            }
        }
        else if(num2 > num1){
            if(num2 > num3){
                if(num1 > num3){
                    System.out.println("A sequencia no maior pro menor é: " + num2 + num1 + num3);
                }
                else {
                    System.out.println("A sequencia do maior pro menor é: " + num2 + num3 + num1);
                }
            }
        }
        else if(num3 > num1){
            if(num3 > num2){
                if(num1 > num2){
                    System.out.println("A sequencia no maior pro menor é: " + num3 + num1 + num2);
                }
                else {
                    System.out.println("A sequencia do maior pro menor é: " + num3 + num2 + num1);
                }
            }
        }
        else {
            System.out.println("Os tres numeros sao iguais");
        }
        // sem usar && e ||
        // que codigo feio, meu deus
    } 
}


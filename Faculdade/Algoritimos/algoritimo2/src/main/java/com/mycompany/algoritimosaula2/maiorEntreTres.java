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
public class maiorEntreTres {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = leia.nextInt();
        
        System.out.println("Digite um segundo numero: ");
        int num2 = leia.nextInt();
        
        System.out.println("Digite um terceiro numero: ");
        int num3 = leia.nextInt();
        
        if( num1 > num2){
            
            if(num1 > num3){
                System.out.println("O maior numero entre eles e: " + num1);
            }  
        }
        
        if(num2 > num1){
            
            if(num2 > num3){
                System.out.println("O maior numero entre eles e: " + num2);
            }
        }
        
        if(num3 > num1){
            
            if(num3 > num2){
                System.out.println("O maior numero entre eles e: " + num3);
            }
        }
        
    }
}
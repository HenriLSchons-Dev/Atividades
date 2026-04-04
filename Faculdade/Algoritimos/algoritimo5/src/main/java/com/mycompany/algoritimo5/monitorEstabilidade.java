/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo5;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class monitorEstabilidade {

    public static void main(String[] args) {
        int num1, num2, diff, contaNum = 0;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero: ");
            num1 = leia.nextInt();
            
            System.out.println("Digite outro numero: ");
            num2 = leia.nextInt();
            
            contaNum = contaNum + 2;
            
            diff = num1 - num2;
        }while(diff >= 50 || diff <= -50);
        System.out.println("Foram necessarios um total de " + contaNum + " numeros para romper loop");
        
        if(diff < 0){
            diff = diff * -1;
            System.out.println("A amplitude atingida é: " + diff);
        }
        else{
            System.out.println("A amplitude atingida é: " + diff);
        }
    }
}


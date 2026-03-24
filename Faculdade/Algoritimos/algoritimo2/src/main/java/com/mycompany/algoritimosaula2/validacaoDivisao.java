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
public class validacaoDivisao {

    public static void main(String[] args) {
        double calculo;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escreva um numero inteiro: ");
        int num1 = leia.nextInt();
        
        System.out.println("Escreva um segundo numero inteiro: ");
        int num2 = leia.nextInt();
        
        if(num2 == 0){
            System.out.println("ERRO: Impossivel dividir por zero");
        }else{
            calculo = num1 / num2;
            
            System.out.println("O resultado da divisao desses dois numeros é igual a:" + calculo);
        }
    }
}

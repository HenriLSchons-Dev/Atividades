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
public class parImpar {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero para saber se ele e par ou impar: ");
        int num = leia.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Seu numero e par!");
        }else{
            System.out.println("Seu numero e impar!");
        }
    }
}

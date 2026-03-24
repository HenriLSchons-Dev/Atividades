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
public class jogoAdivinha {

    public static void main(String[] args) {
        int segredo = 7;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Chute um numero entre 1 e 10:");
        int chute = leia.nextInt();
        
        if(chute == segredo){
            System.out.println("Parabens, voce acertou");
        }else{
            System.out.println("Errou, tente novamente!");
        }
    }
}

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
public class classificacaoNumero {

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero qualquer:");
        num = leia.nextInt();
        
        if(num > 0){
            System.out.println("Seu numero é positivo");
        }
        else if(num < 0){
            System.out.println("Seu numero é negativo");
        }
        else {
            System.out.println("Seu numero é ZERO");
        }
    } 
}

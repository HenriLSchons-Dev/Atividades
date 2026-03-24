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
public class classificacaoTemp {

    public static void main(String[] args) {
        int temperatura;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite uma temperatura em graus Celsius: ");
        temperatura = leia.nextInt();
        
        if(temperatura > 30){
            System.out.println("Esta muito quente hoje");
        }
        else if(temperatura >= 15){
            System.out.println("Esta um clima bem agradavel");
        }
        else {
            System.out.println("Esta muito frio");
        }
    } 
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimosaula2;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class maiorIdade {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos anos voce tem?");
        int idade = leia.nextInt();
        
        if (idade >= 18){
            System.out.println("Voce pode entrar");
        }else{
            System.out.println("Voce nao pode entrar!");
        }
    }
}

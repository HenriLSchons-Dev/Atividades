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
public class senhaNumerica {

    public static void main(String[] args) {
        int senhaCorreta;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escreva uma senha: ");
        int senha = leia.nextInt();
        
        senhaCorreta = 1234;
                
        if( senha == senhaCorreta){
            System.out.println("Acesso concedido!");
        }else {
            System.out.println("Acesso negado!");
        }
    }
}

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
public class aprovacaoEscolar {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite sua nota: ");
        float nota = leia.nextFloat();
        
        if( nota >= 7){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Aluno reprovado!");
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class triagemTecnica {

    public static void main(String[] args) {
        int experiencia;
        boolean java, kotlin;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("O candidato domina Java?");
        java = leia.nextBoolean();
        
        System.out.println("O candidato domina Kotlin?");
        kotlin = leia.nextBoolean();
        
        System.out.println("Quantos anos o canditato possui de experiencia?");
        experiencia = leia.nextInt();
        
        if(java == true || kotlin == true && experiencia >= 5){
            System.out.println("Contratado, nivel pleno");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}
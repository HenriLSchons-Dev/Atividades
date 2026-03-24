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
public class classificacaoIdade {

    public static void main(String[] args) {
        int idade;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        idade = leia.nextInt();
        
        if(idade >= 60){
            System.out.println("O usuario é idoso");
        }
        else if(idade >= 18){
            System.out.println("O usuario é adulto");
        }
        else if(idade >= 13){
            System.out.println("O ususario é um adolescente");
        }
        else {
            System.out.println("O usuario é uma crianca ainda");
        }
    } 
}

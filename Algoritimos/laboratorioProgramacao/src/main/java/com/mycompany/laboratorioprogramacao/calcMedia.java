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
public class calcMedia {

    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a sua nota na primeira prova?");
        nota1 = leia.nextDouble();
        
        System.out.println("Qual a sua nota na segunda prova?");
        nota2 = leia.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if(media >=7){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    } 
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorioprogramacao;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class sistemaNotas {

    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a sua nota na primeira prova: ");
        nota1 = leia.nextDouble();
        
        System.out.println("Digite a sua nota na segunda prova: ");
        nota2 = leia.nextDouble();
        
        System.out.println("Digite a sua nota na segunda prova: ");
        nota3 = leia.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if(media >= 7){
            System.out.println("Aluno aprovado");
        }
        else if(media >= 5){
            System.out.println("Aluno de recuperação");
        }
        else {
            System.out.println("Aluno reprovado");
        }
    }
    
}


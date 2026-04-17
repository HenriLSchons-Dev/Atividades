/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class mediaAcima {

    public static void main(String[] args) {
        int i;
        double media = 0, soma = 0;
        double[] notas = new double[5];
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite as notas de 5 alunos: ");
        
        for(i = 0; i < notas.length; i++){
            notas[i] = leia.nextDouble();
            soma = (soma + notas[i]);
        }
        media = soma / notas.length;
        System.out.println("A media das notas é: " + media);
        
        for(i = 0; i < notas.length; i++){
            if(notas[i] >= media){
                System.out.println("As notas que estao acima da media são: " + notas[i]);
            }
        }
    }
}

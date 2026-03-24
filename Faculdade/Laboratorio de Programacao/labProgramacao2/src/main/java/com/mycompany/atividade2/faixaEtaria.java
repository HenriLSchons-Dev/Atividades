/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class faixaEtaria {

    public static void main(String[] args) {
        
        Scanner leia = new  Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        int idade = leia.nextInt();
        
        if(idade < 0){
            System.out.println("Digite uma idade VALIDA.");
        }
        else if (idade >= 60){
            System.out.println("Você é um idoso!");
        }
        else if(idade >= 18){
            System.out.println("Você é um adulto!");
        }
        else if(idade >= 13){
            System.out.println("Você é um adolescente!");
        }
        else if(idade >= 3){
            System.out.println("Você é uma criança!");
        }
        else if (idade < 2){
            System.out.println("Voce é um bebê!");
        }
    }
}

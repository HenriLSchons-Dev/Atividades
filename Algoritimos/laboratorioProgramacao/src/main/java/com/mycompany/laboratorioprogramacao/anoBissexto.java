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
public class anoBissexto {

    public static void main(String[] args) {
        int ano;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um ano qualquer: ");
        ano = leia.nextInt();
        
        if(ano / 4 == 0){
            System.out.println("Esse ano pode ser bissexto, ele é divisivel por 4, mas pode ser que nao atenda os outro requisitos para ser considerado bissexto.");
        }
        else {
            System.out.println("Esse ano nao é bissexto");
        }
    }
}

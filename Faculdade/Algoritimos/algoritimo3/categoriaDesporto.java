/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class categoriaDesporto {

    public static void main(String[] args) {
        int idade;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a idade do nadador?");
        idade = leia.nextInt();
        
        if(idade < 10){
            System.out.println("Classificacao infantil");
        }
        else if(idade < 15){
            System.out.println("Classificacao juvenil");
        }
        else if(idade < 18){
            System.out.println("Classificacao junior");
        }
        else {
            System.out.println("Classificacao senior");
        }
    }
}

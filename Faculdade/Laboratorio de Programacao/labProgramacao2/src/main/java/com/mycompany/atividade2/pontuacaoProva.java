/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividade2;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class pontuacaoProva {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a pontuacao do aluno de 0 a 100?");
        int nota = leia.nextInt();
        
        if(nota < 0){
            System.out.println("Digite uma nota existente.");
        }
        else if(nota > 100){
            System.out.println("Digite uma nota existente.");
        }
        else if(nota >= 90){
            System.out.println("Nota exelente!");
        }
        else if(nota >= 70){
            System.out.println("Nota boa.");
        }
        else if(nota >= 50){
            System.out.println("Nota regular.");
        }
        else{
            System.out.println("Nota insuficiente!");
        }
    }
}

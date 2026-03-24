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
public class alarmeTemperatura {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor de temperatura da caldeira?");
        int tempCaldeira = leia.nextInt();
        
        if(tempCaldeira > 35){
            System.out.println("PERIGO, sobreaquecimento!");
        }else{
            System.out.println("Temperatura normal");
        }
    }
}
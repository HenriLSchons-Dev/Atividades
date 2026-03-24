/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritimosaula2;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class radarTransito {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qula a velocidade do carro?");
        double velocidade = leia.nextDouble();
        
        if(velocidade >= 120){
            System.out.println("Multado por excesso de velocidade!");
        }else{
            System.out.println("Boa viajem, velocidade adequada.");
        }
    }
}

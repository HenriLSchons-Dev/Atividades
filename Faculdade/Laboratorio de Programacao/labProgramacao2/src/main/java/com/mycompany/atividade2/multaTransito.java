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
public class multaTransito {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a velociade do carro?");
        int velocidade = leia.nextInt();
        
        if(velocidade <= 0){
            System.out.println("Carro parado.");
        }
        else if(velocidade > 100){
            System.out.println("Multa gravíssima!");
        }
        else if(velocidade > 80){
            System.out.println("Multa grave.");
        }
        else if(velocidade > 60){
            System.out.println("Multa leve.");
        }
        else{
            System.out.println("Velocidade permitida da via");
        }
    }
}

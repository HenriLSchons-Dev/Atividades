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
public class estadoAgua {

    public static void main(String[] args) {
        double temperatura;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite uma temperatura: ");
        temperatura = leia.nextDouble();
        
        if(temperatura <= 0){
            System.out.println("Estado solido, gelo");
        }
        else if(temperatura < 100){
            System.out.println("Estado liquido, agua");
        }
        else {
            System.out.println("Estado gasoso, vapor");
        }
    }
}
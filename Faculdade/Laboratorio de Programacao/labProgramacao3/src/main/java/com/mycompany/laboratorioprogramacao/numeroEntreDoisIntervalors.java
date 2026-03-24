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
public class numeroEntreDoisIntervalors {

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Diggite um numero para saber se ele estra entre 0 e 10 OU entre 11 e 20 OU maior que 20.");
        num = leia.nextInt();
        
        if(num > 20){
            System.out.println("Numero maior que 20");
        }
        else if(num > 10){
            System.out.println("Numero entre 11 e 20");
        }
        else if(num > 0){
            System.out.println("Numero entre 0 e 10");
        }
        else {
            System.out.println("Numero negativo, abaixo de 0");
        }
    }
}

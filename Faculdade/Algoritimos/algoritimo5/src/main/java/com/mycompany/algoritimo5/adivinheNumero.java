/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo5;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class adivinheNumero {

    public static void main(String[] args) {
        int segredo = 42, num;
        Scanner leia = new Scanner(System.in);
        
        do{
           System.out.println("Tente acertar o numero em segredo");
           num = leia.nextInt();
           if(num > 42){
               System.out.println("Seu numero é maior que o numero em segredo");
           }
           else if(num < 42){
               System.out.println("Seu numero é menor que o numero em segredo");
           }
        }while(segredo != num);
        System.out.println("Parabens!! Voce acertou o numero");
    }
}
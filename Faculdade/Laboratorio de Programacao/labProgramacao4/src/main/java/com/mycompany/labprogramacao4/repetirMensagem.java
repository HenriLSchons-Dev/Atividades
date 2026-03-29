/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.labprogramacao4;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class repetirMensagem {

    public static void main(String[] args) {
        int num, i = 1;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num = leia.nextInt();
        while(i <= num){
            System.out.println("Olá!");
            i++;
        }
    }
}
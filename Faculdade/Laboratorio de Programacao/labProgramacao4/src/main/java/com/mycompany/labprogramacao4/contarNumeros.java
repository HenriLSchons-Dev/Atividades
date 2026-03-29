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
public class contarNumeros {

    public static void main(String[] args) {
        int num=1, digitados = 0;
        Scanner leia = new Scanner(System.in);
        
        while(num != 0){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            digitados++;
        }
        System.out.println("Foram digitados " + digitados + " numeros");
    }
}
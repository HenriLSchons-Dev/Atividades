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
public class mediaSImples {

    public static void main(String[] args) {
        int media = 0, num, i = 1;
        Scanner leia = new Scanner(System.in);
        
        while(i <= 4){
            System.out.println("Digite um numero: ");
            num = leia.nextInt();
            media = media + num;
            media = media / 4;
            i++;
        }
        System.out.println("A soma de seus numeros é: " + media);
    }
}
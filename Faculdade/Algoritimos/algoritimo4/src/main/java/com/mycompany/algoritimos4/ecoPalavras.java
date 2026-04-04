/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimos4;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class ecoPalavras {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite uma plavra para ver em eco dela:");
        String palavra = leia.nextLine();
        
        for (int i = 1; i <= 10; i++){
            System.out.println(palavra);
        }
        
    }
}

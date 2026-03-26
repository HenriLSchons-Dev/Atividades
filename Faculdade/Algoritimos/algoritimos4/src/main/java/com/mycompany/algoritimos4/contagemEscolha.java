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
public class contagemEscolha {

    public static void main(String[] args) {
        int num;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Deseja contar ate qual numero? ");
        num = leia.nextInt();
        
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}
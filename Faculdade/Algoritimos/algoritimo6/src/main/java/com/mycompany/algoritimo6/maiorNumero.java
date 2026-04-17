/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class maiorNumero {

    public static void main(String[] args) {
        int i, num = 0;
        int[] nota = new int[5];
        Scanner leia = new Scanner(System.in);
        
        for(i = 0; i < nota.length; i++){
            System.out.println("Digite  anota do aluno " + i );
            nota[i] = leia.nextInt();
            if(num < nota[i]){
                num = nota[i];
            }
        }
        System.out.println("A maior nota digitada foi: " + num);
    }
}

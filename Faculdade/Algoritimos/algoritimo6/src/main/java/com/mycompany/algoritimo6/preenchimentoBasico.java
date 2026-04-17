/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritimo6;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class preenchimentoBasico {

    public static void main(String[] args) {
        int i;
        int[] num = new int[5];
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite 5 numeros: ");
        
        for(i = 0; i < num.length; i++){
            num[i] = leia.nextInt();
        }
        
        System.out.println("Os numeros informados são:");
        
        for(i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}

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
public class inversorDigitos {

    public static void main(String[] args) {
        int num, digito, reverso = 0;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero de no max 5 digitos: ");
        num = leia.nextInt();
        
        for(; num > 0;){
            digito = num % 10;
            reverso = reverso * 10 + digito;
            num = num / 10;
        }
        System.out.println("O numero invertido é: " + reverso);
    }
}

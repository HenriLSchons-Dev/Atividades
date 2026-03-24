/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class sinalNumerico {

    public static void main(String[] args) {
        
        int num;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero qualquer: ");
        num = leia.nextInt();
        
        if(num > 0){
            System.out.println("Seu numero e positivo.");
        }
        else if(num < 0){
            System.out.println("Seu numero e negativo.");
        }
        else {
            System.out.println("Seu numero e Zero.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimosaula2;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ordemCrescente {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = leia.nextInt();
        
        System.out.println("Digite um segundo numero: ");
        int num2 = leia.nextInt();
        
        if(num1 >= num2){
            System.out.println("Seus numeros em ordem crescente: " + num1 + " ;" + num2);
        }else{
            System.out.println("Seus numeros em ordem crescente: " + num2 + " ;" + num1);
        }
    }
}

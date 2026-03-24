/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorioprogramacao;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class compararNumeros {

    public static void main(String[] args) {
        int num1, num2;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        num1 = leia.nextInt();
        
        System.out.println("Digite um segundo numero: ");
        num2 = leia.nextInt();
        
        if(num1 > num2){
            System.out.println("O primeiro numero é maior que o segundo");
        }
        else if(num2 > num1){
            System.out.println("O segundo numero é maior que o primeiro");
        }
        else {
            System.out.println("Os dois numeros sao iguais");
        }
    } 
}

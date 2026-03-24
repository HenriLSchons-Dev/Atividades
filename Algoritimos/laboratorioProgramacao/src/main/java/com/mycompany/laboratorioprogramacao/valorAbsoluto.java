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
public class valorAbsoluto {

    public static void main(String[] args) {
        int num, absoluto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um numero qualquer:");
        num = leia.nextInt();
        
        if(num < 0){
            absoluto = num / -1;
            System.out.println("O valor absoluto é igual a: " + absoluto);
        }
        else if(num > 0){
            System.out.println("O valor absoluto é igual a: " + num);
        }
        else {
            System.out.println("O valor absoluto é nulo, ou seja igual a zero");
        }
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividadeaula;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class somaSimples {

    public static void main(String[] args) {
        int soma;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        
        System.out.println("Digite um segundo numero: ");
        int n2 = scanner.nextInt();
        
        soma = n1 + n2;
                
        System.out.println("A soma dos dois numeros e igual a: " + soma);
    }
}

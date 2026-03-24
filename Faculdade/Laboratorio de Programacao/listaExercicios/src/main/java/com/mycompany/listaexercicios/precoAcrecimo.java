/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio6;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class precoAcrecimo {

    public static void main(String[] args) {
        double total;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor do produto?");
        double preco = leia.nextDouble();
        
        total = preco * 1.15;
        
        System.out.println("O preco final do produto com acrecimo de 15% e de: " + total);
    }
}

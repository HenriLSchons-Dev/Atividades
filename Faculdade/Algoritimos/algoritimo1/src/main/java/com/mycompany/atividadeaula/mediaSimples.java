/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeaula;
import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class mediaSimples {

    public static void main(String[] args) {
        double notaFinal;
        Scanner nota = new Scanner(System.in);
    
        System.out.println("Qual sua nota na primeira prova? ");
        double n1 = nota.nextDouble();
        System.out.println("Qual sua nota na segunda porva? ");
        double n2 = nota.nextDouble();
        
        notaFinal = (n1 + n2)/2;
        System.out.println("A sua nota final é: " + notaFinal);
    }
}

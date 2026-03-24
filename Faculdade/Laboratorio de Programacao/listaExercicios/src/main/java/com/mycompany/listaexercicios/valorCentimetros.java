/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class valorCentimetros {

    public static void main(String[] args) {
        double convert;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos quilometros deseja converter para centimetros?");
        double km = leia.nextDouble();
        
        convert = km * 100000;
        
        System.out.println("A conversao para centimetros e de: " + convert);
    }
}

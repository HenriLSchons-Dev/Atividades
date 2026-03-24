/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class conversaoMililitros {

    public static void main(String[] args) {
        double convert;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos litros deseja converter?");
        double litro = leia.nextDouble();
        
        convert = litro * 1000;
        
        System.out.println("O valor em mililitros e de: " + convert);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class areaTrapezio {

    public static void main(String[] args) {
        double area;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor da base maior do trapezio?");
        double baseMaior = leia.nextDouble();
        
        System.out.println("Qual o valor da base menor do trapezio?");
        double baseMenor = leia.nextDouble();
        
        System.out.println("Qual o valor da altura maior do trapezio?");
        double altura = leia.nextDouble();
        
        area = ((baseMaior + baseMenor) * altura) / 2;
        
        System.out.println("A area total desse trapezio e de: " + area);
    }
}

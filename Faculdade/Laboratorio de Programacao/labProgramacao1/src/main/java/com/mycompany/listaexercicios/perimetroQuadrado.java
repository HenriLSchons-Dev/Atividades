/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner; 
        
/**
 *
 * @author Aluno
 */
public class perimetroQuadrado {

    public static void main(String[] args) {
        double perimetro;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor do lado do quadrado?");
        double lado = leia.nextDouble();
        
        perimetro = lado * 4;
        
        System.out.println("O valor do perimetro desse quadrado e de: " + perimetro);
    }
}

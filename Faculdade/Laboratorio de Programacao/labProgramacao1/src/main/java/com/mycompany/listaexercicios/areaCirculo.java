/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class areaCirculo {

    public static void main(String[] args) {
        double area;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual o valor do raio do circulo?");
        double raio = leia.nextDouble();
        
        area = 3.14 * (raio * raio);
        
        System.out.println("O valo da area do circulo e de: " + area);
    }
}

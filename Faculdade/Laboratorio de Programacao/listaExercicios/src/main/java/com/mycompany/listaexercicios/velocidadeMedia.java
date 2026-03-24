/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class velocidadeMedia {

    public static void main(String[] args) {
        double velocidade;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual foi a distancia total percorrida em quilometros?");
        double km = leia.nextInt();
        
        System.out.println("Em quantas horas essa distancia foi percorrida?");
        double horas = leia.nextInt();
        
        velocidade = km / horas;
        
        System.out.println("A velocidade media atingida foi de: " + velocidade);
    }
}

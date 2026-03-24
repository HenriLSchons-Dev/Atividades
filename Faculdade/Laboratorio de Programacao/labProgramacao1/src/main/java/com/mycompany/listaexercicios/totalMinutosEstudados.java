/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class totalMinutosEstudados {

    public static void main(String[] args) {
        double tempo;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantas horas em media voce estuda por dia?");
        double horas = leia.nextDouble();
        
        tempo = horas * 60;
        
        System.out.println("Voce estudou um total de: " + tempo + " minutos");
    }
}

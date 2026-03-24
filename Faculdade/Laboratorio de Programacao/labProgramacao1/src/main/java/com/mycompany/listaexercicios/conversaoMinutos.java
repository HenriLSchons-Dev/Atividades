/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class conversaoMinutos {

    public static void main(String[] args) {
        int minutos;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quanto segundos deseja converter?");
        int segundos = leia.nextInt();
        
        minutos = segundos * 60;
        
        System.out.println("O resultado da conversao e de: " + minutos + "minutos");
    }
}

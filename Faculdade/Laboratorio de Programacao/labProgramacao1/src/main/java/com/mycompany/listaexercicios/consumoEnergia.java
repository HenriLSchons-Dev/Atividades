/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicios;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class consumoEnergia {

    public static void main(String[] args) {
        double consumo;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a potencia do eletro domestico?");
        int potencia = leia.nextInt();
        
        System.out.println("Quantas horas ele foi utilizado?");
        double tempo = leia.nextInt();
        
        consumo = (potencia * tempo) / 1000;
        
        System.out.println("O seu consumo foi de: " + consumo);
    }
}

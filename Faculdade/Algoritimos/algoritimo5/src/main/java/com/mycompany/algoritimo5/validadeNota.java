/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo5;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class validadeNota {

    public static void main(String[] args) {
        int nota;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite sua nota na avaliação: ");
        nota = leia.nextInt();
        
        do{
            System.out.println("Nota invalida, digite su averdadeira nota: ");
            nota = leia.nextInt();
        }while(nota < 0 || nota > 10);
    }
}
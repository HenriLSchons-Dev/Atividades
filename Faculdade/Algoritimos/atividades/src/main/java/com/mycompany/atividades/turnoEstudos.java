/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class turnoEstudos {

    public static void main(String[] args) {
        int hora;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a hora atual?");
        hora = leia.nextInt();
        
        if(hora < 12){
            System.out.println("Bom dia!");
        }
        else if(hora < 18){
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
    }
}

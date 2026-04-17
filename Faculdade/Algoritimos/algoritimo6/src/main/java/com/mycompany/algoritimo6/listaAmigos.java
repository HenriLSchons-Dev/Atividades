/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class listaAmigos {

    public static void main(String[] args) {
        int i;
        String[] lista = new String[5];
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o nome de 5 amigos seus: ");
        for(i = 0; i < lista.length; i++){
            lista[i] = leia.nextLine();
        }
        for(i = 0; i < lista.length; i++){
            System.out.println((i+1) + " - " + lista[i]);
        }
    }
}

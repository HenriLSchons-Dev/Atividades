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
public class investigadorPriv {

    public static void main(String[] args) {
        int i;
        String nome;
        String[] nomes = {"Henri", "Lucas", "Pedro", "Thiago", "Joao"};
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digit eum nome para fazer a busca: ");
        nome = leia.nextLine();
        
        for(i = 0; i < nomes.length; i++){
            if(nomes[i].equals(nome)){
                System.out.println("Encontrado!");
            }
            else{
                System.out.println("Nao encontrado!");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividades;
import java.util.Scanner;

/**
 *
 * @author Henri Lopes Schons
 */
public class menuRestaurante {

    public static void main(String[] args) {
        int menu;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual pagina do menu gostaria de ver?");
        System.out.println("1 - Hamburguer");
        System.out.println("2 - Pizza");
        System.out.println("3 - Saladas");
        System.out.println("4 - Bebidas");
        menu = leia.nextInt();
        
        if(menu == 1){
            System.out.println("X - Tudo: R$ 30");
            System.out.println(" X - Salada: R$ 20");
            System.out.println("Tradicional da Casa: R$ 15");
        }
        else if(menu == 2){
            System.out.println("Portuguesa R$ 50");
            System.out.println("Frango c/ Catupiry: R$ 45");
            System.out.println("4 queijos: R$ 65");
        }
        else if(menu == 3){
            System.out.println("Salada completa: R$ 20");
            System.out.println("Salada ceaser: R$ 25");
            System.out.println("Salada tropical: R$ 20");
        }
        else if(menu == 4){
            System.out.println("Coca Cola: R$ 8");
            System.out.println("Schwepps: R$ 8");
            System.out.println("Fanta laranja: R$ 8");
        }
        else {
            System.out.println("Numero do menu invalido.");
        }
    }
}
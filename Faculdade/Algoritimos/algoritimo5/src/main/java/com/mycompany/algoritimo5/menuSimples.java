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
public class menuSimples {

    public static void main(String[] args) {
        int menu;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println(" 1 - Jogar");
            System.out.println(" 2 - Opções");
            System.out.println(" 3 - Sair");
            menu = leia.nextInt();
        }while(menu != 3);
    }
}
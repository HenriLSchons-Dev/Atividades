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
public class contagemCustom {

    public static void main(String[] args) {
        int bomba, contagem;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Onde comeca a bomba? ");
        bomba = leia.nextInt();
        
        while(bomba != 0){
            System.out.println(bomba);
            bomba--;
        }
        System.out.println("KABOOM!!!");
    }
}

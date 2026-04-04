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
public class divisaoPorDesgaste {

    public static void main(String[] args) {
        int dividendo, divisor, quociente = 0, resto;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o dividendo: ");
        dividendo = leia.nextInt();
        
        System.out.println("Digite o divisor: ");
        divisor = leia.nextInt();
        
        while (dividendo >= divisor) {
            dividendo = dividendo - divisor;
            quociente++;
        }

        resto = dividendo;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}


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
public class tabuadaContinua {

    public static void main(String[] args) {
        int ver, num, i = 0, tabuada;
        Scanner leia = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero para ver sua tabuada: ");
            num = leia.nextInt();
            
            while(i <= 10){
                tabuada = i * num;
                System.out.println(i + " * " + num + " = " + tabuada);
                i++;
            }
            
            i = 0;
            System.out.println("Deseja ver outra tabuada agora? 1-Sim ; 2-Nao");
            ver = leia.nextInt();
            
        }while(ver == 1);
    }
}

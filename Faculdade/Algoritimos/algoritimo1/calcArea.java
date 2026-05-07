/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atividadeaula;
import java.util.Scanner;
/**
 *
 * @author Henri Lopes Schons
 */
public class calcArea {

    public static void main(String[] args) {
        double area;
        Scanner medida = new Scanner(System.in);
        
        System.out.println("Qual a medida da altura?");
        double altura = medida.nextDouble();
        
        System.out.println("Qual a medida da largura?");
        double largura = medida.nextDouble();
        
        area = altura * largura;
        
        System.out.println("A area desse retangulo é igual a: " + area);
    }  
}

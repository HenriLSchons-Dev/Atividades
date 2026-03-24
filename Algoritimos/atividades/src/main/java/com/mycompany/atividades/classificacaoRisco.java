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
public class classificacaoRisco {

    public static void main(String[] args) {
        boolean perfil1, perfil2, perfil3;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Aceita riscos de perda e busca elevados?");
        perfil1 = leia.nextBoolean();
        
        System.out.println("Busca rendimentos acima da inflação, sem perdas de capital?");
        perfil2 = leia.nextBoolean();
        
        System.out.println("Prioriza segurança total?");
        perfil3 = leia.nextBoolean();
        
        if(perfil1 == true){
            System.out.println("Cliente com perfil 'Arrojado'");
        }
        else if(perfil2 == true){
            System.out.println("Cliente com perfil 'Moderado'");
        }
        else if(perfil3 == true){
            System.out.println("Cliente com perfil 'Conservador'");
        }
        else {
            System.out.println("Perfil sem correspondencia ou inexistente");
        }
    }
}

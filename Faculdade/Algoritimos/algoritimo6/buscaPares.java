/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class buscaPares {

    public static void main(String[] args) {
        int i, numPar = 0;
        int[] par = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        
        for(i = 0; i < par.length; i++){
            
            if(par[i] % 2 == 0){
                numPar = par[i];
            }
            
            System.out.println(numPar);
        }
    }
}

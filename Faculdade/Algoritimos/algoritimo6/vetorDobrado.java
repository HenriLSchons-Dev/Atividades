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
public class vetorDobrado {

    public static void main(String[] args) {
        int i;
        int[] A = {5, 15, 22, 4, 9};
        int [] B = new int[5];
        Scanner leia = new Scanner(System.in);
        
        for(i = 0; i < A.length; i++){
            B[i] = 2 * A[i];
        }
        for(i = 0; i < B.length; i++){
            System.out.println(B[i]);
        }
    }
}

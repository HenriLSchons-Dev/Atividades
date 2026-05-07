/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.algoritimo6;

/**
 *
 * @author Henri Lopes Schons
 */
public class uniaoVetores {

    public static void main(String[] args) {
        int i;
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};
        int[] C = new int[6];
        
        for(i = 0; i < A.length - 1; i++){
            C[i] = A[i];
        }
        for(i = 3; i < C.length - 1; i++){
            C[i] = B[i];
            System.out.println(C[i]);
        }
    }
}


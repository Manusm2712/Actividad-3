/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise7;
public class operaciones {
    public static String CalcularValor (double A, double B){
        String resultado;
        if (A>B){
            resultado = "A es mayor que B";                     
        }
        else if (A<B){
            resultado = "A es menor que B";                  
        }
        else {
            resultado = "A es igual que B";             
        }
        return resultado;
    }
}

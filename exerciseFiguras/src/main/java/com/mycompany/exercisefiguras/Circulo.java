/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercisefiguras;
public class Circulo {
    public static double CalcularArea(double radio){
    return Math.PI* Math.pow(radio, 2);        
    }
    public static double CalcularPerimetro(double radio){
    return 2*Math.PI*radio;
    }
}

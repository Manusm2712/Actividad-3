/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise19;
public class Operaciones {
    public static double CalcularPerimetro (double lado){
    return lado*3;        
    }
    public static double CalcularAltura (double lado){
    return (Math.sqrt(3)*lado)/2;        
    }
    public static double CalcularArea (double lado){
    return (Math.sqrt(3)*Math.pow(lado, 2))/4;        
    }
}

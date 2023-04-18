/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise23;
public class Operaciones {
    public static double CalcularSolu1(double a, double b, double c){
    return (-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
    }
    public static double CalcularSolu2(double a, double b, double c){
    return (-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/2*a;
    }
}

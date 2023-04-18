/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercisefiguras;
public class TrianguloRactangulo {
    
    public static double CalcularArea(double base, double altura){
        return (base*altura)/2;        
    }
    public static double calcularHipotenusa(double base, double altura){ 
        return Math.sqrt(base*base+altura*altura);        
    }
    
    public static double CalcularPerimetro(double base, double altura){
        return base+altura+(Math.sqrt(base*base+altura*altura));
    }
    public static String CalcularTipoTriangulo(double base, double altura){
        if ((base == altura) && (base == (Math.sqrt(base*base+altura*altura))) && (altura== (Math.sqrt(base*base+altura*altura))))  {
            return "Equilatero";
        }
        else if ((base != altura) && (base != (Math.sqrt(base*base+altura*altura))) && (altura != (Math.sqrt(base*base+altura*altura)))){
            return "Escaleno";
        }
        else {
            return "Isóceles";
        }
    }
}

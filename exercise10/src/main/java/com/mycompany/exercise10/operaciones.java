/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise10;

/**
 *
 * @author maria
 */
public class operaciones {
    public static double CalcularPago (double patrimonio, double estrato){
    double pago;
    pago = 50000;
        if ((patrimonio>2000000) && (estrato>3)){
        pago = pago + (patrimonio*0.03);
        }
    return pago;
    }   
}

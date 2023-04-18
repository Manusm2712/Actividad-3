/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise18;
public class operaciones {
    public static double SalarioBruto (double hora, double valor){
    return hora*valor;        
    }
    public static double SalarioNeto (double hora, double valor, double retencion){
    return (hora*valor)-(hora*valor*retencion);        
    }   
}

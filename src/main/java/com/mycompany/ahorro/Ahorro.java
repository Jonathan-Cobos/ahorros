/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ahorro;

/**
 *
 * @author Acer
 */
public class Ahorro {

    public static void main(String[] args) {
                     mundo cuenta = new mundo();
      
      cuenta.setSaldo(10000);
      cuenta.consultarSaldo();
      cuenta.consignar(20000);
      cuenta.consultarSaldo();
      cuenta.retiro(10000);
      cuenta.consultarSaldo();
      
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahorro;

/**
 *
 * @author Acer
 */
public class mundo {
        int saldo, transaccion;

    public mundo(int saldo, int transaccion) {
        this.saldo = saldo;
        this.transaccion = transaccion;
    }

    public mundo() {
        this.saldo = 0;
        this.transaccion = 2000;
    }

    //get y set
    public int getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(int transaccion) {
        this.transaccion = transaccion;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //
    public int retiro(int retiro) {
        if (retiro < this.saldo) {
            int impuesto = this.saldo * 4 / 1000;
            this.saldo = this.saldo - impuesto - retiro - this.transaccion;
            System.out.println("se retiro=" + retiro+"$");
            System.out.println("su nuevo saldo es=" + this.saldo+"$");
            return 0;
        } else {
            return -1;
        }
    }

    public void consultarSaldo() {

        this.saldo = this.saldo - this.transaccion;
        System.out.println("costo de la consulta" + this.transaccion+"$");
        System.out.println("su saldo es= " + this.saldo+"$");
    }

    public int consignar(int consignacion) {

        this.saldo = this.saldo + consignacion;
        System.out.println("Se consigno= " + consignacion+"$");

        System.out.println("Su nuevo saldo es= " + this.saldo+"$");

        return this.saldo;
    }

    
}

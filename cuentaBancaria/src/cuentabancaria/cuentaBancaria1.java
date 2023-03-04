/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

public class cuentaBancaria1 {
    private String numeroCuenta;
    private String nombreCliente;
    private double saldo;
    
    public cuentaBancaria1() {
        this.numeroCuenta = "";
        this.nombreCliente = "";
        this.saldo = 0.0;
    }
    
    public cuentaBancaria1(String numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositarEnCuenta(double monto) {
        this.saldo += monto;
    }
    
    public void retirarDeCuenta(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= monto;
        }
    }
    
    public void imprimirDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Nombre del cliente: " + this.nombreCliente);
        System.out.println("Saldo: " + this.saldo);
    }
}
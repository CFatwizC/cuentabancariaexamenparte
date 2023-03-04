/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;
import javax.swing.JOptionPane;
/**
 *
 * @author Derek Franco
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cuentaBancaria1 cuenta1= new cuentaBancaria1("12345", "Juan Perez", 5000.0);
        cuenta1.depositarEnCuenta(Double.parseDouble(JOptionPane.showInputDialog("Cuanto dinero quiere depositar")));
        cuenta1.retirarDeCuenta(Double.parseDouble(JOptionPane.showInputDialog("Cuanto quieres retirar de la cuenta")));
        cuenta1.imprimirDatos();
    }
    
}

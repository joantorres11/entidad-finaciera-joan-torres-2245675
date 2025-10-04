/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class CuentaAhorros extends Cliente {
    String numeroCuenta;
    double saldo;

    public CuentaAhorros(String nombre, String numeroCuenta, double saldo) {
        super(nombre);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void mostarDatos(){
        System.out.println("----DATOS DE LA CUENTA----");
        System.out.printf("Nombre del cliente: %s \nNumero de cuenta: %s \nSaldo: %.2f", this.nombre, this.numeroCuenta, this.saldo);
    }
    
    public void realizarReembolso(double monto){
        this.saldo += monto;
        System.out.printf("Reembolso exitoso. nuevo saldo: %.2f", this.saldo);
    }
    
    public void RealizarRetiro(double monto){
       if(this.saldo > monto){
            this.saldo -= monto;
        System.out.printf("Retiro exitoso. Nuevo saldo: %.2f", this.saldo);
       } else {
           System.out.printf("No tiene saldo disponible!!!. Su saldo es: %.2f", this.saldo);
       }
    }
    
    public void RealizarConsignacion(double monto){
        this.saldo += monto;
        System.out.printf("Consignacion exitosa. nuevo saldo: %.2f", this.saldo);
        
    }
    
    
    
}

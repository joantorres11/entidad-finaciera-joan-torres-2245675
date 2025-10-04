/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.entidadfinanciera;
import Modelo.CuentaAhorros;
/**
 *
 * @author USER
 */
public class EntidadFinanciera {

    public static void main(String[] args) {
        CuentaAhorros miCuenta = new CuentaAhorros("Jose Andres","2324567",120000 );
        
        miCuenta.mostarDatos();
        System.out.println("\n-------------");
        
        miCuenta.RealizarConsignacion(500);
        System.out.println("\n-------------");
        
        miCuenta.RealizarRetiro(800);
        System.out.println("\n-------------");
        
        miCuenta.realizarReembolso(400);
        System.out.println("\n-------------");
        
        miCuenta.RealizarRetiro(300000);
        
    }
}

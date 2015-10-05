/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import java.util.Scanner;

/**
 *
 * @author Nuria Garcia
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float precioTarifa, precioPagado, porcentajePagado, descuento;
        System.out.println("Introduce aqui el precio de la Tarifa");
        Scanner precio1 = new Scanner(System.in);
        precioTarifa = precio1.nextFloat();
        System.out.println("Ahora introduce el precio que has pagado");
        Scanner precio2 = new Scanner(System.in);
        precioPagado = precio2.nextFloat();
        porcentajePagado = precioPagado*100/precioTarifa;
        descuento =100 - porcentajePagado;
        System.out.println("el descuento total de su tarifa es " +porcentajePagado+"%");
        
    }
    
}

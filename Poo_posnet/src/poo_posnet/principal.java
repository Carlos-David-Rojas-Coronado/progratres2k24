/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_posnet;

/**
 *
 * @author Soporte
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona persona = new Persona("40545454", "Luis", "Perez", "2564556", "perezl@gmail.com");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("Banco del Oriente", "1234565656565", 15000, persona, EntidadFinanciera.MASTERCRED);
        System.out.println("Tarjeta antes del Pago");
        System.out.println(tarjeta);
        System.out.println("Ticket generado");
        Ticket ticketGenerado = posnet.efectuarPago(tarjeta, 5000, 2);
        System.out.println(ticketGenerado);
        System.out.println("Tarjeta despues del Pago");
        System.out.println(tarjeta);
        
    }
    
}

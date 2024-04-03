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
public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANTIDAD_CUOTAS = 1;
    public static final int MAX_CANTIDAD_CUOTAS = 6;
    public Ticket efectuarPago(TarjetaDeCredito tarjetaDeCredito, double montoAAbonar, int cantidadCuotas){
        Ticket elTicket = null;
        if (datosValidos(tarjetaDeCredito, montoAAbonar, cantidadCuotas)) {
         //  Si los datos enviados de la tarjeta, el monto y la cantidad de cuotas son aceptables, de acuerdo a los terminos del problema
            double montoFinal = montoAAbonar + (montoAAbonar * recargoSegunCuotas(cantidadCuotas) );
            if (tarjetaDeCredito.TieneSaldoDisponible(montoFinal))
            {
                tarjetaDeCredito.DescontarTarjeta(montoFinal);
                String nombreCompleto = tarjetaDeCredito.NombreCompletoDelTitular();
                double montoPorCuota = montoFinal / cantidadCuotas;
                elTicket = new Ticket(nombreCompleto, montoFinal, montoPorCuota);
            }
        }
        return elTicket;
    }
    private boolean datosValidos(TarjetaDeCredito tarjetaDeCredito, double monto, int cantidad) {
        boolean esTarjetaValida = tarjetaDeCredito != null;
        boolean esMontoValido = monto>0;
        boolean cantidadCuotasValidas = (cantidad>=MIN_CANTIDAD_CUOTAS && cantidad<=MAX_CANTIDAD_CUOTAS);
        return esTarjetaValida && esMontoValido && cantidadCuotasValidas;
    }
    private double recargoSegunCuotas(int cantidadCuotas)
    {
        return (cantidadCuotas-1)*RECARGO_POR_CUOTA;
    }
}

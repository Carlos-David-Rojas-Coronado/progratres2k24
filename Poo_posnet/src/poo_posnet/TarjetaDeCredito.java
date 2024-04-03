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
public class TarjetaDeCredito {
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldoTarjeta;
    private EntidadFinanciera entidadFinanciera;
    private Persona titularTarjeta;
    public TarjetaDeCredito(String entidadBancaria, String numeroTarjeta, double saldoTarjeta, Persona titularTarjeta, EntidadFinanciera entidadFinanciera ){
        this.entidadBancaria=entidadBancaria;
        this.numeroTarjeta=numeroTarjeta;
        this.saldoTarjeta=saldoTarjeta;
        this.titularTarjeta=titularTarjeta;
        this.entidadFinanciera = entidadFinanciera;
    }
    public boolean TieneSaldoDisponible(double monto)
    {
        return saldoTarjeta>=monto;
    }
    public void DescontarTarjeta(double monto)
    {
        saldoTarjeta-=monto;
    }
    public String NombreCompletoDelTitular()
    {
        return titularTarjeta.getNombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", saldoTarjeta=" + saldoTarjeta + ", entidadFinanciera=" + entidadFinanciera + ", titularTarjeta=" + titularTarjeta + '}';
    }
    
}

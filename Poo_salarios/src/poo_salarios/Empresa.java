/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_salarios;

/**
 *
 * @author Soporte
 */


import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    public Empresa()
    {
        this.empleados=new ArrayList<>();
    }
    public void agregarEmpleados(Empleado empleado)
    {
        this.empleados.add(empleado);
    }
    public void mostrarSalarios()
    {
        for (Empleado emp : empleados){
            System.out.println(emp.nombreCompleto() + ": Q " + emp.getSalario());
        }
    }
    public Empleado empleadoConMasClientes()
    {
        int maximo = -1;
        Empleado elMayor = null;
        for (Empleado e : empleados)
        {
            if (e instanceof EmpleadoAComision)
            {
                EmpleadoAComision empleadoAComision = (EmpleadoAComision) e;
                //int cantidad = empleadoAComision.getCantidadClientesCaptados();
                double cantidad = empleadoAComision.getSueldoClientesCaptados();                
                if (cantidad > maximo)
                {
                    maximo = (int) cantidad;
                    elMayor = empleadoAComision;
                }
            }
        }
        return elMayor;
    }
}

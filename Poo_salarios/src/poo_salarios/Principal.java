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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarEmpleados(new EmpleadoSalarioFijo("123", "Ana", "Gomez", 2021 , 45000));
        empresa.agregarEmpleados(new EmpleadoAComision("1234", "Luis", "Siliezar", 2021 , 30000, 100, 500));        
        empresa.agregarEmpleados(new EmpleadoSalarioFijo("12345", "Silvia", "Ruiz", 2019 , 50000));
        empresa.agregarEmpleados(new EmpleadoAComision("123456", "Marco", "Lopez", 2017 , 30000, 200, 100));        
        empresa.mostrarSalarios();
        System.out.println(empresa.empleadoConMasClientes());
    }
    
}

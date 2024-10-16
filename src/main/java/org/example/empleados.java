package org.example;

public class empleados {
    public String nombre;
    public String cargo;
    public double salario;
    public String fecha_ingreso;

    public empleados(String nombre, String cargo, double salario, String fecha_ingreso) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.fecha_ingreso = fecha_ingreso;
    }
    public void presentar(){
        System.out.println("El nombre del empleado es  "+ nombre+
                "su cargo es  " + cargo +
                "su salario es  " + salario +
                " su fecha de ingreso fue   " + fecha_ingreso);


    }
}

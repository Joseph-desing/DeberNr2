package org.example;

import java.util.Scanner;

public class Main_Empleado {

    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);

        //Declaracion de variables
        String nombre;
        String cargo;
        double salario;
        String fecha_ingreso;

        //Ingreso de datos
        System.out.println("Ingrese el nombre:  ");
        nombre= a.nextLine();
        System.out.println("Ingrese el cargo:   ");
        cargo= a.nextLine();
        System.out.println("Ingrese el salario:  ");
        salario=a.nextDouble();
        a.nextLine();
        System.out.println("Ingrese su fecha de ingreso:  ");
        fecha_ingreso= a.nextLine();

        //Crear el primer objeto
        empleados p1= new empleados(nombre, cargo,salario,fecha_ingreso);

        //INGRESO DEL SEGUNDO EMPLEADO
        System.out.println("-----------------------------");
        System.out.println("INGRESE EL SEGUNDO EMPLEADO");
        System.out.println("Ingrese el nombre:  ");
        nombre= a.nextLine();
        System.out.println("Ingrese el cargo:   ");
        cargo= a.nextLine();
        System.out.println("Ingrese el salario:  ");
        salario=a.nextDouble();
        a.nextLine();
        System.out.println("Ingrese su fecha de ingreso:  ");
        fecha_ingreso= a.nextLine();

        //crear segundo empleado
        empleados p2= new empleados(nombre,cargo,salario,fecha_ingreso);

        System.out.println("-----------------------------");
        System.out.println("INGRESE EL TERCER EMPLEADO");
        System.out.println("Ingrese el nombre:  ");
        nombre= a.nextLine();
        System.out.println("Ingrese el cargo:   ");
        cargo= a.nextLine();
        System.out.println("Ingrese el salario:  ");
        salario=a.nextDouble();
        a.nextLine();
        System.out.println("Ingrese su fecha de ingreso:  ");
        fecha_ingreso= a.nextLine();

        //crear segundo empleado
        empleados p3= new empleados(nombre,cargo,salario,fecha_ingreso);


        //llamar a metodo
        p1.presentar();
        System.out.println("");
        p2.presentar();
        System.out.println("");
        p3.presentar();



    }
}

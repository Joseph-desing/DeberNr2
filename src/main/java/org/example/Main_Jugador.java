package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_Jugador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador: ");
        String nom = input.nextLine();
        System.out.println("Ingrese la posicion del jugador: ");
        String pos = input.nextLine();
        System.out.println("Ingrese la edad del jugador: ");
        int ed = input.nextInt();
        System.out.println("Ingrese el numero de la camiseta del jugador: ");
        int n_cami = input.nextInt();

        input.nextLine();

        jugador j1 = new jugador(nom,pos,ed,n_cami);

        jugador j2 = new jugador("Moises","Volante",22,23);

        System.out.println("Ingrese el nombre del jugador: ");
         nom = input.nextLine();
        System.out.println("Ingrese la posicion del jugador: ");
        pos = input.nextLine();
        System.out.println("Ingrese la edad del jugador: ");
        ed = input.nextInt();
        System.out.println("Ingrese el numero de la camiseta del jugador: ");
        n_cami = input.nextInt();

        jugador j3 = new jugador(nom,pos,ed,n_cami);

        j1.mostrar_jugador();
        j2.mostrar_jugador();
        j3.mostrar_jugador();




    }
}
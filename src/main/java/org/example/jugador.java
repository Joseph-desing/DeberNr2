package org.example;

public class jugador {
    public String nombre;
    public String posicion;
    public int edad;
    public int numero_camiseta;

    public jugador(String nombre, String posicion, int edad, int numero_camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.numero_camiseta = numero_camiseta;
    }

    public void mostrar_jugador(){
        System.out.println("El jugador de nombre:"+nombre+
                "que juega de la posicion: "+posicion+
                "que tiene la edad: "+edad+" y su numero de camiseta es:"+numero_camiseta);
    }
}

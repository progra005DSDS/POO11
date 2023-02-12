package org.Sanchez.Metodos;

public class Tarea_de_Poo {
    public static void producto(String nombre, String catalogo, String caducidad,String valor,String elaboracion){
        System.out.println("el producto es :" + nombre + " vale: " + valor + " y pertenece a los: " + catalogo + " Se elaboro el: " + elaboracion + " y caduca el " + caducidad );

    }
    public void datosProducto(){
        producto("Leche","Lacteo","2023","30 pesos","01/02/2000");

    }
}

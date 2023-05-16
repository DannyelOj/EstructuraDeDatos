/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller02;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class metodosTaller {
    
    Scanner entrada;
    
    public metodosTaller() {
        this.entrada = new Scanner(System.in);
    }
    
    public int menu() {
        System.out.println("1. Insertar elementos ");
        System.out.println("2. Presentar arreglo");
        System.out.println("3. Llenar espacio vacio");
        System.out.println("4. Recorrer arreglo a la derecha");
        System.out.println("5. Llenar arreglo ordenado");
        System.out.println("6. Busqueda binaria");
        System.out.println("7. Salir \n");

        return entrada.nextInt();
    }
}

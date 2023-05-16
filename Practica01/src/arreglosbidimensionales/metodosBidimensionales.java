/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class metodosBidimensionales {
    Scanner entrada;
    
    public metodosBidimensionales() {
        this.entrada = new Scanner(System.in);
    }
    
    public int menu() {
        System.out.println("1. Matriz traspuesta");
        System.out.println("2. Matriz traspuesta diagonal secundaria");
        System.out.println("3. Multiplicar matriz a * b");
        System.out.println("4. MCD");
        System.out.println("5. Salir");
        

        return entrada.nextInt();
    }
    
    public int[][] traspuestaMatriz(int[][]a){
        int b[][] = new int [4][4];
        for(int i = 0; i<a.length;  i++){
            for(int j=0; j<a[i].length; j++){
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
    
    public int[][] traspuestaSecundaria(int[][]a){
    int[][]b=new int[4][4];
    int k = 3;
    int l = 3;
    int aux;
    for(int i = 0; i<a.length;  i++){
            for(int j=0; j<a[i].length; j++){
                
            }
    
        }
    return a;
    }
}
    
   

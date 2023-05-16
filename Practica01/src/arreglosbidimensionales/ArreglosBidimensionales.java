/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package arreglosbidimensionales;

/**
 *
 * @author UTPL
 */
public class ArreglosBidimensionales {

    public static void main(String[] args) {
        metodosBidimensionales obj = new metodosBidimensionales();
        System.out.println("Hello World!");
        int a [][]  = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int b [][];
        b = obj.traspuestaMatriz(a);
        
        for(int i = 0; i<b.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println(b[i][j]);
            }
        }
    }
}

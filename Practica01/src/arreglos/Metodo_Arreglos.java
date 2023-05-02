package arreglos;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodo_Arreglos {

    Scanner entrada;

    public Metodo_Arreglos() {
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

    public int llenarArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresar elemento" + i);
            a[i] = entrada.nextInt();
        }
        return a.length;
    }

    public void presentar(int[] a, int ev) {
        for (int i = 0; i < ev; i++) {
            System.out.println(a[i] + " \n");
        }
    }

    public int insertarUltimo(int[] a, int ev) {
        if (ev < a.length) {
            System.out.println("Ingresar un elemento");
            a[ev] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("Arreglo lleno");
        }
        return ev;
    }

    public void recorrerDerecha(int[] a, int ev, int b) {
        for (int i = ev; i > b; i--) {
            a[i] = a[i - 1];

        }

    }

    public int insertarInicio(int[] a, int ev) {
        if (ev < a.length) {
            recorrerDerecha(a, ev, 0);
            System.out.println("Ingresar un elemento");
            a[0] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("Arreglo lleno");
        }
        return ev;
    }

    public int ordenarArreglo(int[] a, int ev) {
        int pos = 0;
        int num = 0;
        if (ev < a.length) {

            System.out.println("Ingresar un elemento");
            num = entrada.nextInt();
            if (ev == 0) {
                a[pos] = num;
            } else {
                while (pos < ev && num > a[pos]) {
                    pos++;
                    recorrerDerecha(a, ev, pos);
                    a[pos] = num;
                    ev++;
                }

            }
        } else {
            System.out.println("Arreglo lleno");
        }

        return ev;
    }

    public int busquedaBinaria(int[] x, int ini, int fin, int num) {
        int medio = 0;
        if (ini < fin) {
            medio = (ini + fin) / 2;
            if (x[medio] == num) {
                return medio;
            } else if (num > x[medio]) {
                return busquedaBinaria(x, medio + 1, fin, num);
            } else {
                return busquedaBinaria(x, ini, medio - 1, num);
            }
        } else {
            return -1;
        }
    }

    public void ordenarregllo(int[] x, int ini, int fin) {
        int aux;
        int a = ini;
        int b = fin;
        int pv = x[(ini + fin) / 2];
        do {
            while (x[a] < pv) {
                a++;
            }
            while (x[b] > pv) {
                b++;
            }
            if (a < b) {
                aux = x[a];
                x[a] = x[b];
                x[b] = x[a];
            }
            a++;
            b--;
        } while (a <= b);
        if (ini < b);
            ordenarregllo(x, ini, b);
        if (a < fin);
            ordenarregllo(x, ini, b);
    }

    public void recorrerIzq(int[] x, int pos, int ev) {
        for (int i = pos; i > ev-1; i++) {
            x[i] = x[i + 1];
        }
    }
    
    public int secuencial(int[]x, int num, int ev){
        for(int i = 0; i <ev; i++){
            if(x[i]==num)
                return i;
        }
        return -1;
    }
    
    public int elimina(int[]x, int num, int ev){
        int pos=secuencial(x,num,ev);
        if(pos!=1){
            recorrerIzq(x, pos, ev);
            ev--;
        }
        return ev;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2glenda;

/**
 *
 * @author Cristian Camareno
 */
public class algoritmoOrden {

    int i, j, variable;

    public algoritmoOrden() {
        this.i = 0;
        this.j = 0;
        this.variable = 0;
    }

    public void burbuja(int[] arreglo) {
        for (i = 0; i < arreglo.length; i++) {
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    variable = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = variable;

                }
            }
        }
    }

    public void insercion(int[] arreglo, int n) {
        int i, j, auxiliar;
        for (i = 1; i < n; i++) {
            auxiliar = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > auxiliar) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = auxiliar;
        }
        System.out.println("Ordenado por insercion");
        mostarOrden(arreglo);

    }

    public void mostarOrden(int[] arreglo) {
        int g;
        for (g = 0; g < arreglo.length; g++) {
            System.out.print("[" + arreglo[g] + "]");
        }
        System.out.println();
    }

    public void seleccion(int arreglo[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < arreglo.length - 1; i++) {
            menor = arreglo[i];
            pos = i;
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < menor) {
                    menor = arreglo[j];
                }
            }
            if (pos != i) {
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos];
                arreglo[pos] = tmp;
            }
            System.out.println("Ordenado por seleccion");
            mostarOrden(arreglo);
        }

    }
}

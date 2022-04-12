/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2glenda;

import javax.swing.JOptionPane;

/**
 *
 * @author Glenda Camareno
 */
public class Tarea2Glenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector1[] = {1, 2, 3, 10, 5, 18, 7, 8, 9, 4, 20, 12, 13, 14, 15, 16, 17, 6, 19, 5};
        int Menu = 0;
        int Op;
        algoritmoOrden ordenar = new algoritmoOrden();

        Op = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el orden que desea ver" + '\n' + "1.Orden Principal" + '\n' + "2. Ordenado por burbuja" + '\n' + "3. Ordenado por incersion" + '\n' + "4.Ordenado por seleccion"));

        switch (Op) {

            case 1:
                System.out.println("orden principal");
                ordenar.mostarOrden(vector1);
                break;

            case 2:
                System.out.println("ordenado con burbuja");
                ordenar.burbuja(vector1);
                ordenar.mostarOrden(vector1);
                break;

            case 3:
                System.out.println("ordenado con insercion");
                int tamano;
                tamano = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique tamano del arreglo"));
                int vector2[] = new int[tamano];
                for (int i = 0; i < tamano; i++) {
                    vector2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento"));
                    ordenar.insercion(vector2, i + 1);
                }
                break;
                
            case 4: System.out.println("ordenado con seleccion");
                ordenar.seleccion(vector1);
                ordenar.mostarOrden(vector1);
                break;
                

        }

    }

}


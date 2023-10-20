/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colejerex01_listanumerosv2;

import java.util.Scanner;
import servicios.NumeroService;

/**
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y 
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se 
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el 
programa mostrará por pantalla el número de valores que se han leído, su suma y su 
media (promedio). 
 */
public class COLEjerEX01_ListaNumerosV2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        NumeroService ns = new NumeroService();

        boolean stop;

        System.out.println("Ingrese numeros para insertar en la lista:");
        System.out.println("(Si desea detenerse, inserte el numero -99 que dara fin al agregado.)");
        do {
            int num = input.nextInt();
            stop = ns.validarNumero(num);
            if (!stop) {
                ns.ingresarNumero(num);
            } else {
                ns.mostrarValores();
            }
        } while (!stop);

    }    
}

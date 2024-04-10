package com.mycompany.labsemana5;

import java.util.*;

public class LabSemana5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Funciones f = new Funciones();
        int inicio = 0;
        int op = 0;
        int n;
        while (inicio == 0) {
            System.out.println("============================");
            System.out.println("1- Contar Digitos de un numero");
            System.out.println("2- Suma de Digitos de un numero");
            System.out.println("3- Maximo Comun Divisor");
            System.out.println("4- Invertir Cadena");
            System.out.println("0- Salir");
            int bandera = 0;
            while (bandera == 0) {
                try {
                    System.out.print("Ingrese un numero: ");
                    op = leer.nextInt();
                    if (op >= 0 && op <= 4) {
                        bandera = 1;
                    } else {
                        System.out.println("Ingrese un numero dentro del rango");
                    }
                } catch (Exception e) {
                    leer.next();
                    System.out.println("No ingreso un numero o es muy largo");
                }
            }
            if (op == 1) {
                System.out.println("============================");
                n = f.Excepcion();
                System.out.println("El total de digitos es: "+f.ContarDigitos(n, 0));
            }
            if (op == 2) {
                System.out.println("============================");
                n = f.Excepcion();
                System.out.println("La suma de los digitos de los numeros es: " + f.SumaDigitos(n));
            }
            if (op == 3) {
                System.out.println("============================");
                System.out.print("Primer Numero. ");
                int n1 = f.Excepcion();
                System.out.print("Segundo Numero. ");
                int n2 = f.Excepcion();
                System.out.println("El MCD entre "+(n1)+" y "+(n2)+" es: "+f.MCD(n1, n2));
            }
            if (op == 4) {
                System.out.println("============================");
                System.out.print("Ingrese una cadena: ");
                leer.nextLine();
                String cadena = leer.nextLine();
                System.out.println("La cadena invertida es: ");
                System.out.println(f.InvertirCadena(cadena, -1, cadena.length() - 1));
            }
            if (op == 0){
                System.out.println("============================");
                System.out.println("Adios");
                inicio = 1;
            }
        }
    }
}

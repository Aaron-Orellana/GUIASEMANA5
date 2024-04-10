package com.mycompany.labsemana5;

import java.util.*;

public class Funciones {

    Scanner leer = new Scanner(System.in);

    public int Excepcion() {
        int n = 0;
        int bandera;
        do {
            try {
                System.out.print("Ingrese un numero: ");
                n = leer.nextInt();
                if (n >= 0) {
                    bandera = 1;
                } else {
                    System.out.println("Ingrese un numero positivo");
                    bandera = 0;
                }
            } catch (Exception e) {
                leer.next();
                System.out.println("No ingreso un numero o es muy largo");
                bandera = 0;
            }
        } while (bandera == 0);
        return n;
    }

    public int ContarDigitos(int n, int suma) {
        if (n == 0) {
            return suma;
        } else {
            suma++;
            return ContarDigitos(n / 10, suma);
        }
    }

    public int SumaDigitos(int n) {
        if (n == 0) {
            return n;
        } else {
            return ((n % 10) + SumaDigitos(n / 10));
        }
    }

    public String InvertirCadena(String palabra, int inicio, int fin) {
        if (inicio == fin) {
            String a = "";
            return a;
        } else {
            char L = palabra.charAt(fin);
            System.out.print(L);
            return InvertirCadena(palabra, inicio, fin - 1);
        }
    }

    public int MCD(int n1, int n2) { //TEOREMA DE EUCLIDES
        if (n2 == 0) {
            return n1;
        } else {
            return MCD(n2, n1 % n2);
        }
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List pares = new ArrayList();

        int count = 0;
        while (count < 5) {
            System.out.println("Ingrese un numero: ");
            int num = parseInt(in.nextLine());
            if (num % 2 == 0) {
                pares.add(num);
                count++;
            }
        }
        System.out.println("El contenido del array de pares es: " + pares);
    }
}
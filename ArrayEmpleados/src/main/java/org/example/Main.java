package org.example;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List empleados = new ArrayList();

        int count = 0;
        while (count < 2) {
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = in.nextLine();
            System.out.println("Ingrese el apellido del empleado: ");
            String apellido = in.nextLine();
            System.out.println("Ingrese la edad del empleado: ");
            Integer edad = parseInt(in.nextLine());
            System.out.println("Ingrese el sueldo del empleado: ");
            Double sueldo = Double.parseDouble(in.nextLine());

            Empleado empleado = new Empleado(nombre, apellido, edad, sueldo);
            empleados.add(empleado);
            count++;
        }

        Collections.sort(empleados, new Comparator<Empleado>() {
            @Override
            public int compare(Empleado p1, Empleado p2) {
                return p2.getSueldo().compareTo(p1.getSueldo());
            }
        });

        System.out.println("El empleado de mayor sueldo es: " + "\n" + empleados.get(0));
    }

    public static class Empleado {

        String nombre;
        String apellido;
        Integer edad;
        Double sueldo;

        public Empleado() {
        }

        public Empleado(String nombre, String apellido, Integer edad, Double sueldo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.sueldo = sueldo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Integer getEdad() {
            return edad;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public Double getSueldo() {
            return sueldo;
        }

        public void setSueldo(Double sueldo) {
            this.sueldo = sueldo;
        }

        @Override
        public String toString() {
            return apellido + ", " + nombre + "\n"
                    + edad + " años" + "\n"
                    + "Sueldo: $" + sueldo;
        }
    }
}
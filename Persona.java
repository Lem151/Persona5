/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.persona;

/**
 *
 * @author elvik
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    
    private static final char SEXO_DEF = 'H';
    
    public Persona() {
        this("", 0, "", SEXO_DEF, 0, 0);
    }
    
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, "", sexo, 0, 0);
    }
    
    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        verificarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    public String calcularIMC() {
        double IMC = peso / (altura * altura);
        
        if (IMC < 18.5) {
            return "Debajo del peso";
        }
        else if (IMC >= 18.5 && IMC <= 24.9) {
            return "Peso ideal";
        }
        else if (IMC >= 25 && IMC <= 29.9) {
            return "Sobrepeso";
        }
        else {
            return "Obesidad";
        }
    }
    
    public String esMayorDeEdad() {
        if (edad >= 18) {
            return "Es mayor";
        }
        else {
            return "Es menor";
        }
    }
    
    public void verificarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
        else {
            this.sexo = sexo;
        }
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + calcularIMC());
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Cris", 21, "12345678A", 'R', 50.3, 1.65);
        persona.mostrarInformacion();
    }
}

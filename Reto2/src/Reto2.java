import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Reto2 {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("Escribe tu apellido");
        var apellido = consola.nextLine();
        System.out.println("Escribe tu edad");
        var edad = consola.nextLine();
        System.out.println("Escribe tu estatura en metros");
        var estatura = consola.nextLine();
        System.out.println(" " + "Nombre = " + nombre + " " + "Apellido =" + apellido + " " + "Edad =" + edad + " " + "Estatura = " + estatura + "m");

    }


    }
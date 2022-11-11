
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Reto5 {

    public static void main(String[] args) {
        System.out.println("Escribe el nombre de tu mascota");
        Scanner consola = new Scanner(System.in);
        var nombreMas = consola.nextLine();
        System.out.println("Escribe la edad de tu mascota");
        var edadMas = consola.nextLine();
        System.out.println("Escribe el tipo de mascota");
        var tipoMas = consola.nextLine();
        System.out.println("Escribe tu nombre");
        var nombre = consola.nextLine();
        System.out.println("Escribe tu apellido");
        var apellido = consola.nextLine();
        System.out.println(" " + nombreMas + " " + "es un(a)" + " " + tipoMas + ", el cual, tiene" + " " + edadMas + " " + "años de edad" + " " + "y" + " " + nombre + " " + apellido + " " + "es actualmente su dueño(a)");

    }

}
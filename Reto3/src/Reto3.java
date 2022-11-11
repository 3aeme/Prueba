
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Reto3 {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("Escribe tu apellido");
        var apellido = consola.nextLine();
        System.out.println("Escribe el nombre de tu padre");
        var nombrePa = consola.nextLine();
        System.out.println("Escribe el apellido de tu padre");
        var padreAp = consola.nextLine();
        System.out.println("Escribe el nombre de tu madre");
        var nombreMa = consola.nextLine();
        System.out.println("Escribe el apellido de tu madre");
        var madreAp = consola.nextLine();
        System.out.println(" " + "Yo" + " " + nombre + " " + apellido + " " + "soy hijo de" + " " + nombreMa + " " + "y" + " " + nombrePa);

    }

}

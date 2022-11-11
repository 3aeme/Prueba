
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Reto4 {

    public static void main(String[] args) {
        System.out.println("Escribe una Ciudad capital");
        Scanner consola = new Scanner(System.in);
        var capital = consola.nextLine();
        System.out.println("Escribe el país de esa capital");
        var pais = consola.nextLine();
        System.out.println(" " + "La ciudad" + " " + capital + ", es la capital del país" + " " + pais);

    }

}
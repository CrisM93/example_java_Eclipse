package tarealibreria;

import java.util.Scanner;

/**
 *
 * @author crizt
 */
public class TareaLibreria {

    public static void main(String[] args) {

        /*System.out.println("Proporciona el nombre:");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();

        System.out.println("Propociona el id ");
        var id = consola.nextLine();

        System.out.println("Propociona el precio ");
        float precio = Float.parseFloat(consola.nextLine());

        System.out.println("Propociona el envio gratuito");
        var envio = consola.nextLine();

        System.out.println(titulo + " #" + id);
        System.out.println("Precio: " + " $" + precio);
        System.out.println("Envio Gratuito: " + envio);*/
 /*System.out.println("Proporciona el Alto:");
        Scanner consola = new Scanner(System.in);
        int alto = Integer.parseInt(consola.nextLine());

        System.out.println("Propociona el Ancho");
        int ancho = Integer.parseInt(consola.nextLine());

        System.out.println("Area: " + "<" + (alto * ancho) + ">");
        System.out.println("Perimetro: " + "<" + (alto + ancho) * 2 + ">");            */
        //COMPRACIONDE DOS NUMERO TAREA
        /*Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1:");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Propociona el numero2");
        int numero2 = Integer.parseInt(consola.nextLine());

        var resultado = (numero1 > numero2) ? "numero1= " + numero1 : "numero2= " + numero2;
        System.out.println("Es mayor el numero " + resultado);
         */
        //-----------Sistema de calificaciones
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese un valor entr 0 y 10");
        float valor = Float.parseFloat(console.nextLine());

        var calificacion = "valor desconocido";

        if (valor >= 9 && valor <= 10) {
            calificacion = "A";
        } else if (valor >= 8 && valor < 9) {
            calificacion = "B";
        } else if (valor >= 7 && valor < 8) {
            calificacion = "C";
        } else if (valor >= 6 && valor < 7) {
            calificacion = "D";
        } else if (valor >= 0 && valor < 6) {
            calificacion = "F";
        } else {
            calificacion = "valor desconocido";
        }
        System.out.println(calificacion);
    }
}

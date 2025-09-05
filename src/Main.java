
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    }
    public static void Dados_3(){
        var i = 0;
        int Da1, Da2, Da3, SumaDa1 = 0, SumaDa2 =0, SumaDa3 = 0;
        for (i = 0; i <= 20; i++) {

            Random aleatorio = new Random();
            Da1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            Da2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            Da3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            SumaDa3 += Da3;
            SumaDa1 += Da1;
            SumaDa2 += Da2;


        }
        if (SumaDa1 > SumaDa2 && SumaDa1 > SumaDa3) {
            System.out.println("El Dado #1 GANA es mayor que Dado #2 y #3: " + SumaDa1);
            System.out.println("El valor de #2 es: " + SumaDa2);
            System.out.println("El valor de #3 es: " + SumaDa3);
        } else if (SumaDa2 > SumaDa1 && SumaDa2 > SumaDa3) {
            System.out.println("El Dado #2 GANA es mayor que el #1 y #3: " + SumaDa2);
            System.out.println("El valor de #1 es: " + SumaDa1);
            System.out.println("El valor de #3 es: " + SumaDa3);
        } else if (SumaDa3 > SumaDa1 && SumaDa3 > SumaDa2) {
            System.out.println("El Dado #3 GANA es mayor que el #1 y #2: " + SumaDa3);
            System.out.println("El valor de #1 es: " + SumaDa1);
            System.out.println("El valor de #2 es: " + SumaDa2);
        } else {
            System.out.println("Hay un empate entre los dados.");
        }


    }
    public static void Dados_2(){
        var i = 0;
        int Da1, SumaDa1 = 0, Da2, SumaDa2 = 0;
        for (i = 0; i <= 20; i++) {
            Random aleatorio = new Random();
            Da1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            Da2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            SumaDa1 += Da1;
            SumaDa2 += Da2;



        }
        if (SumaDa1 > SumaDa2) {
            System.out.println("La Suma total de el dado #1 es : " + SumaDa1);

        } else if (SumaDa2 > SumaDa1) {
            System.out.println("El valor de #2 es: " + SumaDa2);
        } else {
            System.out.println("Hay un empate entre los dados.");
        }
    }
    public static void IMC(){
        Scanner teclado = new Scanner(System.in);
        double peso;
        System.out.println("Digite su peso: ");
        double altura;
        System.out.println("Digite su altura: ");
        peso = teclado.nextDouble();
        altura = teclado.nextDouble();
        if (peso < 18.5) {
            System.out.println("Su peso es muy bajo");
        }else if (peso > 18.5 && peso < 24.9) {
            System.out.println("Su peso esta en promedio");
        }else if (peso > 25 && peso < 26.9) {
            System.out.println("Su rango de peso esta en Sobre Peso °1");
        }else if (peso > 27 && peso < 29.9) {
            System.out.println("Su rango de peso esta en Sobre peso °2");
        }else if (peso > 30 && peso < 34.9) {
            System.out.println("Su rango de peso esta en Obesidad Tipo 1");
        }else if (peso > 35 && peso < 39.9) {
            System.out.println("Su rango de peso esta en Obesidad Tipo 2");
        }else if (peso > 40 && peso < 49.9) {
            System.out.println("Su rango de peso esta en Obesidad Tipo 3 (MORBIDA)");
        } else {

            System.out.println("SU Rango de peso es Obesidad Extrema");
        }

    }
}
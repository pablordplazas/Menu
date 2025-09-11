import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENÚ PRINCIPAL =====");
            System.out.println("1. Lanzar 2 Dados");
            System.out.println("2. Lanzar 3 Dados");
            System.out.println("3. Calcular el IMC");
            System.out.println("4. Calculadora de calorias");
            System.out.println("5. Juego de Dados");
            System.out.println("6. Salir");
            System.out.println("Seleccione una Opcion");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> Dados_2();
                case 2 -> Dados_3();
                case 3 -> IMC();
                case 4 -> Calculador_Calorias();
                case 5 -> Juego_Dados();
                case 6 -> System.out.println("Saliendo del programa.....");
                default -> System.out.println("Opcion Invalida, Intente de Nuevo");
            }
        } while (opcion != 6);
    }

    public static void Dados_3(){
        int Da1, Da2, Da3, SumaDa1 = 0, SumaDa2 =0, SumaDa3 = 0;
        Random aleatorio = new Random();
        for (int i = 0; i < 20; i++) {
            Da1 = aleatorio.nextInt(6) + 1;
            Da2 = aleatorio.nextInt(6) + 1;
            Da3 = aleatorio.nextInt(6) + 1;
            SumaDa3 += Da3;
            SumaDa1 += Da1;
            SumaDa2 += Da2;
        }
        if (SumaDa1 > SumaDa2 && SumaDa1 > SumaDa3) {
            System.out.println("El Dado #1 GANA: " + SumaDa1);
        } else if (SumaDa2 > SumaDa1 && SumaDa2 > SumaDa3) {
            System.out.println("El Dado #2 GANA: " + SumaDa2);
        } else if (SumaDa3 > SumaDa1 && SumaDa3 > SumaDa2) {
            System.out.println("El Dado #3 GANA: " + SumaDa3);
        } else {
            System.out.println("Hay un empate entre los dados.");
        }
        System.out.println("Resultados totales = D1: " + SumaDa1 + " | D2: " + SumaDa2 + " | D3: " + SumaDa3);
    }

    public static void Dados_2(){
        int Da1, Da2, SumaDa1 =0, SumaDa2 = 0;
        Random aleatorio = new Random();
        for (int i = 0; i < 20; i++) {
            Da1 = aleatorio.nextInt(6) + 1;
            Da2 = aleatorio.nextInt(6) + 1;
            SumaDa1 += Da1;
            SumaDa2 += Da2;
        }
        if (SumaDa1 > SumaDa2) {
            System.out.println("El Dado #1 GANA con: " + SumaDa1);
        } else if (SumaDa2 > SumaDa1) {
            System.out.println("El Dado #2 GANA con: " + SumaDa2);
        } else {
            System.out.println("Hay un empate entre los dados.");
        }
        System.out.println("Resultados totales = D1: " + SumaDa1 + " | D2: " + SumaDa2);
    }

    public static void IMC() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite su peso en kg EJ 50: ");
        double peso = teclado.nextDouble();
        System.out.print("Digite su altura en metros EJ 1.70: ");
        double altura = teclado.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Su peso es muy bajo");
        } else if (imc < 24.9) {
            System.out.println("Su peso está en promedio");
        } else if (imc < 26.9) {
            System.out.println("Sobrepeso grado 1");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso grado 2");
        } else if (imc < 34.9) {
            System.out.println("Obesidad Tipo 1");
        } else if (imc < 39.9) {
            System.out.println("Obesidad Tipo 2");
        } else if (imc < 49.9) {
            System.out.println("Obesidad Tipo 3 (MORBIDA)");
        } else {
            System.out.println("Obesidad Extrema");
        }
    }
    public static void Juego_Dados() {
        int Da1, Da2, SumaDa1 = 0, SumaDa2 = 0;
        Random aleatorio = new Random();

        System.out.println("HAY 6 reglas importantes:");
        System.out.println("1. El juego será de 2 jugadores y elegirán si quieren ser el jugador 1 o el jugador 2.");
        System.out.println("2. El puntaje de todos empieza en 0.");
        System.out.println("3. El dado debe ser de 6 caras solamente.");
        System.out.println("4. Si te sale 1 en el dado, se restará 1 punto.");
        System.out.println("5. Si sale de 2 a 6, se suman los puntos normalmente.");
        System.out.println("6. Si alguno de los jugadores supera al otro por 3 puntos o más, se declara ganador automáticamente.");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 20; i++) {
            Da1 = aleatorio.nextInt(6) + 1;
            Da2 = aleatorio.nextInt(6) + 1;


            if (Da1 == 1) {
                SumaDa1 -= 1;
            } else {
                SumaDa1 += Da1;
            }

            if (Da2 == 1) {
                SumaDa2 -= 1;
            } else {
                SumaDa2 += Da2;
            }

            if (Math.abs(SumaDa1 - SumaDa2) >= 3) {
                System.out.println("---------------------------------------------");
                if (SumaDa1 - SumaDa2 >= 3) {
                    System.out.println("¡El Jugador #1 ha superado al Jugador #2 por 3 o más puntos!");
                    System.out.println("El Jugador #1 GANA con: " + SumaDa1 + " puntos.");
                } else {
                    System.out.println("¡El Jugador #2 ha superado al Jugador #1 por 3 o más puntos!");
                    System.out.println("El Jugador #2 GANA con: " + SumaDa2 + " puntos.");
                }

                System.out.println("Resultados totales:");
                System.out.println("Jugador #1: " + SumaDa1 + " puntos.");
                System.out.println("Jugador #2: " + SumaDa2 + " puntos.");
            }
        }

        System.out.println("---------------------------------------------");
        if (SumaDa1 > SumaDa2) {
            System.out.println("El Jugador #1 GANA con: " + SumaDa1 + " puntos.");
        } else if (SumaDa2 > SumaDa1) {
            System.out.println("El Jugador #2 GANA con: " + SumaDa2 + " puntos.");
        } else {
            System.out.println("Hay un empate entre los jugadores.");
        }

        System.out.println("Resultados totales:");
        System.out.println("Jugador #1: " + SumaDa1 + " puntos.");
        System.out.println("Jugador #2: " + SumaDa2 + " puntos.");
    }



    public static void Calculador_Calorias() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite su peso en kg EJ 60: ");
        double peso = teclado.nextDouble();
        System.out.print("Digite su altura en metros EJ 1,70: ");
        double altura = teclado.nextDouble();

        double calorias = (peso * 25) + (altura * 100);

        System.out.println("Según su peso y altura, usted debería consumir alrededor de: "
                + calorias + " calorías por día.");
        System.out.println("Recuerde que es un cálculo aproximado.");
    }
}
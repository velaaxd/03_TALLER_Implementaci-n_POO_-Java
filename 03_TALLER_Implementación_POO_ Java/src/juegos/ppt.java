package juegos;

import java.util.Scanner;

public class ppt {
    

    private boolean sal;
    private int opcion;
    private int random;

    public ppt() {
        sal = false;
        opcion = 0;
        random = 0;
    }

    Scanner leer = new Scanner(System.in);

    

    public void juego1() {
        do {
            System.out.println("Piedra, papel o tijera");
            System.out.println("Elige tu opcion: piedra (1), papel (2) o tijera (3)");

            opcion = leer.nextInt();
            random = (int) (Math.random() * 3) + 1;

            if (random == 1 && opcion == 1) {
                System.out.println("Respuesta: tijera");
                System.out.println("¡Felicidades has ganado!");
            } else if (random == 1 && opcion == 2) {
                System.out.println("Respuesta: tijera");
                System.out.println("Has perdido");

            } else if (random == 3 && opcion == 1) {
                System.out.println("Empate");
            } else if (random == 2 && opcion == 2) {
                System.out.println("Respuesta: piedra");
                System.out.println("Has ganado");
            } else if (random == 3 && opcion == 3) {
                System.out.println("Respuesta: piedra");
                System.out.println("Has perdido");
            } else if (random == 3 && opcion == 2) {
                System.out.println("Empate");
            } else if (random == 2 && opcion == 1) {
                System.out.println("Respuesta: papel");
                System.out.println("Has perdido");

            } else if (random == 2 && opcion == 3) {
                System.out.println("Respuesta: papel");
                System.out.println("¡Felicidades has ganado!");
            } else if(random==1 && opcion==3){
                System.out.println("empate");
            }
            System.out.println("¿Desea Seguir Jugando?");
            if(leer.next().equals("si")) sal=false ;
            else  sal=true;
        }while(!sal);
    }
    public void finalizar(){

        System.out.println("fin del juego");
    }

    
}


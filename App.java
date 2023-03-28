import java.util.Scanner;

import juegos.cs;
import juegos.ppt;

public class App {
    public static void main(String[] args){

        int opcion;

        Scanner Leer = new Scanner(System.in);

       

        System.out.println("elija que quiere jugar [1]piedra papel o tijera 2[cara o sello]");
        opcion = Leer.nextInt();
        
        if (opcion==1) {
            ppt juego = new ppt();
            juego.juego1();
            juego.finalizar();
        }else if  (opcion==2) {
            cs juego2 = new cs();
            juego2.juego2();
            juego2.finalizar();
        }
        Leer.close();
    }
}

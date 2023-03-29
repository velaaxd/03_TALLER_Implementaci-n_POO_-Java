package juegos;
import java.util.Scanner;
import java.util.Random;

public class cs {
    
    private boolean sal;
    private double c;
    private int s;
    private Scanner leer;
    private Random random;

    public cs() {
        sal = false;
        c = 0;
        s = 0;
        leer = new Scanner(System.in);
        random = new Random();
    }

    public void iniciar() {
        
    }


        public void juego2() {
            do {

            System.out.println("Digite la cantidad de dinero a apostar: ");
                c = leer.nextDouble();
            System.out.println("Elija sello o cara: [1],[2]");
                s = leer.nextInt();

                switch (s) {
                    case 1:
                        int i = random.nextInt(2);
                        if (i == 0) {
                            System.out.println("Felicidades salio Sello");
                            c *= 2; // Multiplica la cantidad apostada por 2
                        } else {
                            System.out.println("Salio Cara usted perdio");
                            c = 0; // Pierde la cantidad apostada
                        }
                        break;

                    case 2:
                        int h = random.nextInt(2);
                        if (h == 0) {
                            System.out.println("Salio Sello usted perdio");
                            c = 0; // Pierde la cantidad apostada
                        } else {
                            System.out.println("Felicidades salio Cara");
                            c *= 2; // Multiplica la cantidad apostada por 2
                        }
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }

                System.out.println("Dinero actual: " + c);
                System.out.println("¿Desea Seguir Jugando?");
                if (leer.next().equalsIgnoreCase("si")) {
                    sal = false;
                    System.out.println("Elija sello o cara :[1],[2]");
                    s = leer.nextInt();
                } else {
                    sal = true;
                }
            } while (!sal);
        }

        public void finalizar(){
            System.out.println("fin del juego");
        }

        public boolean isSal() {
            return sal;
        }

        public void setSal(boolean sal) {
            this.sal = sal;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public int getS() {
            return s;
        }

        public void setS(int s) {
            this.s = s;
        }
    
}

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione la figura geométrica : ");
            System.out.println("1. triangulo");
            System.out.println("2. cuadrado");
            System.out.println("3. Circulo");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la base del triangulo:");
                    double baseTriangulo = sc.nextDouble();
                    System.out.println("Ingrese la altura del triangulo:");
                    double alturaTriangulo = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                    System.out.println("El área del triangulo es: " + triangulo.calcularArea());
                    break;
                case 2:
                    System.out.println("Ingrese la base del cuadrado:");
                    double baseCuadrado = sc.nextDouble();
                    System.out.println("Ingrese la altura del cuadrado:");
                    double alturaCuadrado = sc.nextDouble();
                    Cuadrado Cuadrado = new Cuadrado(baseCuadrado, alturaCuadrado);
                    System.out.println("El area del cuadrado es: " + Cuadrado.calcularArea());
                    break;
                case 3:
                    System.out.println("Ingrese el radio del circulo:");
                    double radioCirculo = sc.nextDouble();
                    Circulo circulo = new Circulo(radioCirculo);
                    System.out.println("El area del circulo es: " + circulo.calcularArea());
                    break;
                case 0:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
                    break;
            }
        } while (opcion != 0);
        sc.close();
    }
}

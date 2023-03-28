public class Cuadrado {
    private double base;
    private double altura;

    public Cuadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}

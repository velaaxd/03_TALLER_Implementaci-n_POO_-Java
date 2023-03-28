package salud;

public class Empleado extends personas {
    private String cargo;
    private String departamento;
    private int valorhora;
    private int horastrabajadas;



    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo, String cargo, String departamento, int valorhora, int horastrabajadas) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorhora = valorhora;
        this.horastrabajadas = horastrabajadas;
    }

   
}

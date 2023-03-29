package salud;

import java.util.Scanner;

public class personas{
    Scanner Leer =new Scanner(System.in);
    
    private String tipoDoc;
    private int documento, edad;
    private String nombre, apellido , sexo;
    private double peso, estatura;
    private double pesoActual;
    private String cargo;
    private String departamento;
    double valorhora;
    double horastrabajadas;
    double valorFinal;


    //metodo constructor
    
    public personas(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void pedirDatos(){
        System.out.println("porfavor digite el tipo de documento : ");
        tipoDoc = Leer.next();
        System.out.print("porfavor digite el documento : ");
        documento = Leer.nextInt();
        System.out.print("porfavor digite el nombre : ");
        nombre = Leer.next();
        System.out.println("porfavor digite el apellido : ");
        apellido = Leer.next();
        System.out.println("porfavor digite peso : ");
        peso = Leer.nextDouble();
        System.out.println("porfavor digite la estatura : ");
        estatura = Leer.nextDouble();
        System.out.println("porfavor digite la edad : ");
        edad = Leer.nextInt();
        System.out.print("porfavor digite el sexo : ");
        sexo = Leer.next();
        System.out.println("digite su cargo");
        cargo = Leer.next();
        System.out.println("digite su departamento");
        departamento = Leer.next();
        
        
        
    
    }

    
    

    public double calcularHonorarios() {

        System.out.println("digite el valor de hora");
        valorhora = Leer.nextInt();
        System.out.println("digite horas trabajadas");
        horastrabajadas = Leer.nextInt();
        
        double valorTotal = valorhora * horastrabajadas;
        double reteica = valorTotal * 0.00966;
        double valorFinal = valorTotal - reteica;

        System.out.println("El valor total es: " + valorTotal); // agregado para verificar si se está ejecutando correctamente
        System.out.println("El total a pagar es: " + valorFinal);
    
        return valorFinal;
    }

    


    

    public void mostrarDatospersona(){
        System.out.println("los datos ingresados fueron : ");
        System.out.println(tipoDoc);
        System.out.println(documento);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(peso);
        System.out.println(estatura);
        System.out.println(edad);
        System.out.println(sexo);
        System.out.println(cargo);
        
        

        
    }

    

    public void calcularlmc(){
        if(edad<18){
            System.out.println("usted es menor de edad ");
        }

        if(edad>=18){
            System.out.println("usted es mayor de edad");
        }

        pesoActual = (peso)/(estatura)*2;
        
        if (pesoActual < 20.0) {
            System.out.println("PESO BAJO");
        } else if (pesoActual <= 25.0) {
            System.out.println("PESO IDEAL");
        } else {
            System.out.println("SOBREPESO");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

   

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    
    
    
}
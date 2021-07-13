package co.edu.utp.misiontic2022.c3;

//Heredo de la clase Persona que es la Super Clase
public class Empleado extends Persona{

    private double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto){
        super(nombre,edad);
        this.sueldoBruto = sueldoBruto;
    }

    //Getters y Setters
    public double getSueldoBruto() {
        return sueldoBruto;
    }
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void mostrar(){
        System.out.println();
        System.out.println("Datos del Empleado:");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Sueldo Bruto: " + getSueldoBruto());        
    }
}
package co.edu.utp.misiontic2022.c3;

public class Persona{
    //Atributos de Persona
    private String nombre;
    private int edad;
    //Constructor de Persona
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;        
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }    
    
    //Metodo que muestra segun el diagrama UML, Es igual a public void toString(){print("");}
    public void mostrar(){
        System.out.println();
        System.out.println("Datos de la Persona:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }   


}
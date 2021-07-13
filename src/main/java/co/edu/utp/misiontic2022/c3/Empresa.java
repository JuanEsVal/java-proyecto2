package co.edu.utp.misiontic2022.c3;


public class Empresa{
    private String nombre;
    private Empleado empleado;

    public Empresa(String nombre, Empleado empleado){
        this.nombre = nombre;
        this.empleado = empleado;
    }
    public String getNombre() {
        return nombre;
    }

    public void mostrar(){
        System.out.println("\n");
        System.out.println("Datos de la Empresa:");
        System.out.println("Nombre: " + getNombre());
        empleado.mostrar();
    }   

}
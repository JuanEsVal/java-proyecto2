package co.edu.utp.misiontic2022.c3;

public class Cliente extends Persona{

    private String telefonoContacto;

    public Cliente(String nombre, int edad, String telefonoContacto){
        super(nombre,edad);
        this.telefonoContacto =telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public void mostrar(){
        System.out.println();
        System.out.println("Datos del Cliente:");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Telefono de Contacto: " + getTelefonoContacto());        
    }

}
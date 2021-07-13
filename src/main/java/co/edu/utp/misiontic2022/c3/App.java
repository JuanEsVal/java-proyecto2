package co.edu.utp.misiontic2022.c3;

public class App 
{
    public static void main( String[] args )
    {
        Persona persona1 = new Persona("Carlos", 32);
        Persona persona2 = new Empleado("Juan", 29, 2560.345);
        Persona persona3 = new Cliente("Pedro", 35, "3017047025");

        //composicion
        Empresa empresa1 = new Empresa("MinTic", (Empleado)persona2);


        //Polimorfismo: Mostrar de Persona, Empleado y Cliente es diferente
        persona1.mostrar();
        persona2.mostrar();
        persona3.mostrar();
        empresa1.mostrar();

        System.out.println( );
    }
}

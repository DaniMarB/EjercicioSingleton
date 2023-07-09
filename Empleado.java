package EjercicioSingleton;

public class Empleado {

    private String nombre;
    private String apellido;


    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void imprimir(){
        Impresora impresora1 = Impresora.getInstance();
        impresora1.imprimir();
        System.out.println("El empleado "+ nombre + " "+ apellido+" ha realizado una impresión");
    }
}

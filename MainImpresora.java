package EjercicioSingleton;

public class MainImpresora {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Daniel","Marquez");
        Empleado empleado2 = new Empleado("Gabriela","Torres");

        System.out.println("Cantidad de impresiones: "+Impresora.getInstance().getCantidadActual());
        empleado1.imprimir();
        System.out.println("Cantidad de impresiones: "+Impresora.getInstance().getCantidadActual());
        empleado2.imprimir();
        System.out.println("Cantidad de impresiones: "+Impresora.getInstance().getCantidadActual());
    }
}

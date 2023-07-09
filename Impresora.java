package EjercicioSingleton;

public class Impresora {

    private static Impresora conteo;

    public int cantidadActual;

    public Impresora() {
    }

    public static Impresora getInstance(){
        if(conteo == null){
            conteo = new Impresora();
        }
        return conteo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void imprimir(){
        cantidadActual++;
        System.out.println("La cantidad de impresiones es :"+cantidadActual);
    }
}

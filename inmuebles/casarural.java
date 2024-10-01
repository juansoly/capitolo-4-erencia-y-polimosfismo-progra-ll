package inmuebles;

public class casarural extends casa{
    protected  static double valorArea=150000;
    protected  int distanciaCabrera;
    protected  int altitud;

    public casarural(int indentificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabrera, int altitud) {
        super(indentificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabrera = distanciaCabrera;
        this.altitud = altitud;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia la cabecera municipal ="+numeroHabitaciones+"km");
        System.out.println("Altitud sobre el nivel del mar="+altitud+"metros");
        System.out.println();
    }
}

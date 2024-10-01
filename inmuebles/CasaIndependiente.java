package inmuebles;

public class CasaIndependiente extends  CasaUrbana{
    protected static double valorArea=3000000;

    public CasaIndependiente(int indentificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(indentificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }


    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}

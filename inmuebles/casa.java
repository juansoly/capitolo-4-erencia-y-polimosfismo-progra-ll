package inmuebles;

public class casa extends InmuebleVivienda {
   protected int NumeroPisos;

    public casa(int indentificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(indentificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        NumeroPisos = numeroPisos;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("numero de pisos :"+NumeroPisos);
    }
}
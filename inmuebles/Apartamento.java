package inmuebles;

public class Apartamento extends InmuebleVivienda{
    public Apartamento(int indentificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(indentificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    void imprimir(){
        super.imprimir();

    }
}

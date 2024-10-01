package inmuebles;

public class InmuebleVivienda extends inmueble {
    protected  int numeroHabitaciones;
    protected  int numeroBaños;

    public InmuebleVivienda(int indentificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(indentificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("numero de Habitaciones ="+numeroHabitaciones);
        System.out.println("numero de Baños=="+numeroBaños);
    }
}

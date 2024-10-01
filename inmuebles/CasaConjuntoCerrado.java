package inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana{
    protected  static  double valorArea=250000;
    protected  int valorAdministracion;
    protected  boolean tienePiscina;
    protected  boolean tieneCamposDeportivo;

    public CasaConjuntoCerrado(int indentificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivo) {
        super(indentificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivo = tieneCamposDeportivo;
    }


    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la administracion ="+valorAdministracion);
        System.out.println("tiene piscina ="+tienePiscina);
        System.out.println("tiene camous deportivo="+tieneCamposDeportivo);
        System.out.println();
    }
}

package inmuebles;

public class local extends inmueble{
    enum Tipo {INTERNO,CALLE};
    protected Tipo TipoLocal;

    public local(int indentificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        super(indentificadorInmobiliario, area, direccion);
        this.TipoLocal = tipoLocal;
    }


    void imprimir() {
        super.imprimir();
        System.out.println("tipo local ="+TipoLocal);
    }
}

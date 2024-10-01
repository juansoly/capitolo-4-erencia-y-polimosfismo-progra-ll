package inmuebles;

public class officina extends local {
    protected  static  double valorArea=350000;
    protected  boolean esGobierno;

    public officina(int indentificadorInmobiliario, int area, String direccion, Tipo tipoLocal, boolean esGobierno) {
        super(indentificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }


    void imprimir() {
        super.imprimir();
        System.out.println("Es oficina gubernamental ="+esGobierno);
        System.out.println();
    }
}

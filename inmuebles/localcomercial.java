package inmuebles;

public class localcomercial extends local {
    protected  static  double valorArea=3000000;
    protected  String centroComerical;

    public localcomercial(int indentificadorInmobiliario, int area, String direccion, Tipo tipoLocal, String centroComerical) {
        super(indentificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComerical = centroComerical;
    }


    void imprimir() {
        super.imprimir();
        System.out.println("centro comercial="+centroComerical);
        System.out.println();
    }
}

public class CuentaAhorros extends cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        if (saldo < 10000)
            activa = false;
        else
            activa = true;
    }

    public void retirar(float cantidad) {
        if (activa)
            super.retirar(cantidad);


    }

    public void consignar(float cantidad) {
        if (activa) ;
        super.consignar(cantidad);

    }

    public void extractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        if (saldo < 10000)
            activa = false;
    }

    public void imprimir() {
        System.out.println("saldo=$"+saldo);
        System.out.println("comision mensual=$"+comisionMensual);
        System.out.println("numero de transacciones="+(numeroCansignaciones+numeroRetiros));
        System.out.println();


    }
}
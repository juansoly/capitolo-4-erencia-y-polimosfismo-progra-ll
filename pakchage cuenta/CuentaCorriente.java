public class CuentaCorriente extends cuenta {
    float sobregiro;
    public CuentaCorriente(float saldo,float tasa){
        super(saldo,tasa);
        sobregiro=0;
    }
    public void retirar(float cantidad){
        float resultado=saldo-cantidad;
        if(resultado <0){
            sobregiro=sobregiro-resultado;
            saldo=0;
        }else{
            super.retirar(cantidad);
        }
    }
    public void consignar(float cantidad){
        float residuo=sobregiro-cantidad;
        if(sobregiro>0){
            if(residuo>0){
                sobregiro=0;
                saldo=0;
            }

        }else{
            super.consignar(cantidad);
        }
    }
    public void extractoMensual(){
        super.extractoMensual();
    }
    public void imprimir(){
        System.out.println("saldo= $"+saldo);
        System.out.println("cargo Mensual = $"+comisionMensual);
        System.out.println("numero de transacciones ="+(numeroCansignaciones +numeroRetiros));
        System.out.println("Valor sobregiro = $"+(numeroCansignaciones+numeroRetiros));
        System.out.println();

    }


}

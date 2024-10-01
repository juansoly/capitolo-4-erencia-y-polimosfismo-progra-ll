public class cuenta {
    protected  float saldo;
    protected  int numeroCansignaciones=0;
    protected  float tasaAnual;
    protected  int numeroRetiros;
    protected  float comisionMensual=0;

    public cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public  void consignar(float cantidad){
        saldo=saldo+cantidad;
        numeroCansignaciones=numeroCansignaciones+1;
    }
    public  void retirar(float cantidad){
        float nuevoSaldo=saldo-cantidad;
        if(nuevoSaldo>=0){
            saldo-=cantidad;
            numeroRetiros=numeroRetiros+1;
        }else{
            System.out.println("la cnatidad a retirar exce el saldo actual");
        }
    }
    public void calcularInteres(){
        float tasaMensual=tasaAnual/12;
        float interesMensual=saldo*tasaMensual;
        saldo+=interesMensual;
    }
    public  void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteres();
    }
}

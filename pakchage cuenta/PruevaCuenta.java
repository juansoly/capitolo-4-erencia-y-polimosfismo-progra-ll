import java.util.Scanner;

public class PruevaCuenta {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("cuenta de ahorros");
        System.out.println("ingrese saldo inicial=$");
        float saldoInicialAhorros=input.nextFloat();
        System.out.println("ingrese tasa interes:=");
        float tasaAhoros=input.nextFloat();
        CuentaAhorros cuenta1=new CuentaAhorros(saldoInicialAhorros,tasaAhoros);
        System.out.println("ingresar cantidad a consignar:$");
        float catidadDepositar=input.nextFloat();
        cuenta1.consignar(catidadDepositar);
        System.out.println("ingresar la cantidad a retirar");
        float cantidadRetirar=input.nextFloat();
        cuenta1.retirar((cantidadRetirar));
        cuenta1.extractoMensual();
        cuenta1.imprimir();


    }
}
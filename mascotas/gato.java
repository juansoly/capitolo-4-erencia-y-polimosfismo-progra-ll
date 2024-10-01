package mascotas;

public class gato extends  mascota{
    private  String raza;

    public gato(String nombre, int edad, String color, String raza, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.raza = raza;
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }
    public void imprimirDatos(){super.mascota();}
    public  void mostrarDatos(){
        System.out.println("raza"+raza);
    }

    double alturaSalto;
    double longitudSalto;

    static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }
}


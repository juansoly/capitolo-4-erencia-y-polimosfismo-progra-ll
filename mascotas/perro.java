package mascotas;

public class perro extends mascota {
    protected double peso;
    protected boolean muerde;
    protected String raza;
    protected String tamaño;


    public perro(String nombre, int edad, String color, double peso, boolean muerde, String raza, String tamaño) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void  imprimirdatos(){super.mascota();}

    public void mostrarDatos() {
        System.out.println("peso" + peso);
        System.out.println("muerde" + muerde);
        System.out.println("raza" + raza);
    }


    static void sonido() {

        System.out.println("Los perros ladran");
    }
}


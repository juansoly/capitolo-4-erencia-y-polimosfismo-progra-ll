package mascotas;

public class mascota {
    String nombre;
    int edad;
    String color;

    public mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    public void mascota(){
        System.out.println("nombre"+nombre);
        System.out.println("edad"+edad);
        System.out.println("color"+color);
    }
}

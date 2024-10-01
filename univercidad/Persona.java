package univercidad;

public class Persona {
     String nombre;
     String dirección;
     String teléfono;
     String email;

    public Persona(String nombre, String dirección, String teléfono, String email) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.email = email;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }


    public void  imprimirDatos(){
        System.out.println("nombre="+nombre);
        System.out.println("direccion="+dirección);
        System.out.println("telefono="+teléfono);
        System.out.println("email="+email);
    }
}

package univercidad;

public class Profesor extends Persona {
    private String departamento;
    private int antigüedad;

    public Profesor(String nombre, String dirección, String teléfono, String email,
                    String departamento, int antigüedad) {
        super(nombre, dirección, teléfono, email);
        this.departamento = departamento;
        this.antigüedad = antigüedad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }
    public  void mostrarDatos(){super.imprimirDatos();}
    public  void  imprimir(){
        System.out.println( "departamento="+antigüedad);
        System.out.println("antiguedad="+antigüedad);
    }
}

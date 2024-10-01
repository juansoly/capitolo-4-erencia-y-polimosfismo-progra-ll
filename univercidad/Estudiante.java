package univercidad;

public class Estudiante extends Persona {
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String dirección, String teléfono, String email,
                      String carrera, int semestre) {
        super(nombre, dirección, teléfono, email);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public  void imprimirDatos(){super.imprimirDatos();}

    public  void imprimir(){
        System.out.println("carrera="+carrera);
        System.out.println("semestre="+semestre);
    }
}

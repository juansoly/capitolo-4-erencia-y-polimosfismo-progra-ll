package pakchage;

public class LibrosTexUniversidadColombia extends librosDeTexto{
    private String facultad_quelo_publico;

    public LibrosTexUniversidadColombia(String titulo, String autor, int precio, String cursoLibro, String facultad_quelo_publico) {
        super(titulo, autor, precio, cursoLibro);
        this.facultad_quelo_publico = facultad_quelo_publico;
    }

    public String getFacultad_quelo_publico() {
        return facultad_quelo_publico;
    }

    public void setFacultad_quelo_publico(String facultad_quelo_publico) {
        this.facultad_quelo_publico = facultad_quelo_publico;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    public  void imprimir(){
        System.out.println("la facultad que lo publico es:"+facultad_quelo_publico);
    }
}

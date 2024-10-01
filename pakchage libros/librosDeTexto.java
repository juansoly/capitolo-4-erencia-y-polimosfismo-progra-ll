package pakchage;

import java.sql.SQLOutput;

public class librosDeTexto extends libro{
    private String cursoLibro;

    public librosDeTexto(String titulo, String autor, int precio, String cursoLibro) {
        super(titulo, autor, precio);
        this.cursoLibro = cursoLibro;

    }

    public String getCursoLibro() {
        return cursoLibro;
    }

    public void setCursoLibro(String cursoLibro) {
        this.cursoLibro = cursoLibro;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

    public void imprimir(){
        System.out.println("CursoLibro:::::"+cursoLibro);

    }
}

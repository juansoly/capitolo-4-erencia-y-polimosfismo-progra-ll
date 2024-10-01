package pakchage;

public class novelas extends libro{
    private String tipo;

    public novelas(String titulo, String autor, int precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }


    public void imprimir(){
        System.out.println("tipo de libro ?::"+tipo);
    }
}

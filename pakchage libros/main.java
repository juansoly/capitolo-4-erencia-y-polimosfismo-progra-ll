package pakchage;

public class main {
    public static void main(String[]args){
        libro libro1 =new libro("las locas","alez",21);
        librosDeTexto librosDeTexto1 =new librosDeTexto("dalas","ramon",213,"segundo año");
        LibrosTexUniversidadColombia librosTexUniversidadColombia1=new LibrosTexUniversidadColombia("las golondrinas","mishel",30,"2año","facultad de historia");
        libro1.mostrarInformacion();

        librosDeTexto1.mostrarInformacion();
        librosDeTexto1.imprimir();
        librosTexUniversidadColombia1.mostrarInformacion();
        librosTexUniversidadColombia1.imprimir();

    }

}

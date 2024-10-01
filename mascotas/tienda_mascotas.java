package mascotas;

public class tienda_mascotas {
    public  static void  main(String[]Args){

        perro perro1=new perro("boby",4,"negro",3.2,false,"joski","mediano");
        gato gato1 =new gato("pelusa",3,"blanco","ejipcio",2.3,1.2);

       perro1.imprimirdatos();
        perro1.mostrarDatos();

        gato1.imprimirDatos();
        gato1.mostrarDatos();
    }

}

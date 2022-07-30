//para leer flujo de caractereres
import java.io.Reader;
// evento-leer un archivo de texto
import java.io.FileReader;
public class texto {
    public static void main(String[] args) {
        //crea un arreglo
        char[] arreglo=new char[50];
        try{
            //creando un lector
            Reader entrada=new FileReader("C:\\Users\\PILARES_EDC\\Desktop\\java.txt");
            //revisando a lector Filereder si esta listo
            System.out.println("hay datos en el archivo "+entrada.ready());
            //lerr las caracteres
            entrada.read(arreglo);
            if (entrada.ready()== true){

                System.out.println("si hay datos");

            }
            for (int i=0; i<arreglo.length;i++){
                System.out.print(arreglo[i]);
            }

            // cerrar el lector
            entrada.close();
        }
        catch (Exception e){
            e.getStackTrace();
        }

    }
}

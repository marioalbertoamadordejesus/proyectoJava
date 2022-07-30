import com.sun.source.util.SourcePositions;
// listas
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedList;
public class reader {
    public static void main(String[] args) {
        // creando una lista
        LinkedList<String> animales =new LinkedList<>();
        // agregando elementos
        animales.add("perro");
        animales.add("gato");
        animales.add("loro");
        System.out.println("la lista enlasaes es" + animales.get(1));
        // añadir un nuevo elemento
        animales.add(1, "caballo");
        System.out.println(animales);
        // cambiar el valor de un elemento
       animales.set(2,"vaca marina");
       System.out.println(animales);
       // eliminar un elemento se puede usar animales.remove(2); o
       String str= animales.remove(2);
       System.out.println(animales);

    }
}

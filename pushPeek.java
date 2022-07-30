import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Stack;
class pushPeek {
    public static void main(String[] args) {
        Stack<String>animales=new Stack<>();
        animales.push("gallina");
        animales.push("gaviota");
        animales.push("dodo");
        System.out.println("plia"+animales);

        // metodo pop
        String elemento=animales.pop();
        System.out.println(elemento);
        // acceder al elemento a la parte superiro de la pila
        elemento = animales.peek();
        System.out.println(elemento);
        //accede al elemento de la parte siuperiro de la pila
        int posicion=animales.search("2");
        // revisar si la pila esta vacia
        Boolean resultado=animales.empty();
        System.out.println(resultado);
    }

}

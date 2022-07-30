import java.util.Scanner;
public class edad {

    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner dato = new Scanner(System.in);
        System.out.println("nombre");
        nombre = dato.nextLine();

        System.out.println("edad");
        edad = dato.nextInt();

        if (edad>18){
            System.out.println("tu nombre es "+nombre+"y tu edade es"+edad+"eres mayor de edad");
        } else if (edad<18) {
            System.out.println("tu nombre es "+nombre+"y tu edade es"+edad+"eres menro de edad");
        }
        System.out.println("tu nombre tiene  "+nombre.length()+"Caracteres");
    }
}
// intermdiario leer texto pila
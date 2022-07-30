
import java.util.Scanner; // importo paqueteria
public class serFactorial {
    public static void main(String[] args){
        Scanner teclado = new Scanner( System.in ); //llamo a scanner
        int factorial;
        int num;
        System.out.print("Introduce un valor: ");
        num=teclado.nextInt();
        factorial=1;
        for (int i=num;i>0;i--) { /*invoco a un decremento para que el valor de facorial recorra todas las
        multiplicaciones del numeor natural invocado*/


            factorial=factorial*i; /*En la fórmula Factorial se deben multiplicar todos los números enteros y positivos
            que hay entre el número que aparece en la fórmula y el número */

        }
        System.out.println("El factorial de"+ num+"es: "+factorial);



    }
}



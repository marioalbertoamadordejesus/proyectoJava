
import java.util.*;
public class nota {
    public static void main(String[] args) {
        int suma=0, media,alta,minima, valor=7,provicional;
        int[] notas= new int[valor];
        for( int i=0; i<notas.length;i++){
            System.out.println("cual es tu nota");
            Scanner sc= new Scanner(System.in);
            provicional= sc.nextInt();
            if (provicional>=0 && provicional<=10){
                notas[i]=provicional;
                suma=suma+notas[i];

            }


        }
        for( int i=0; i<notas.length;i++){
            System.out.println(notas);
            media=suma/notas.length;
            System.out.print("la nota media es"+media);
            int notamin= Arrays.stream(notas).min().getAsInt();
            System.out.println("la nota minion es"+ notamin);
            int notamax= Arrays.stream(notas).max().getAsInt();
            System.out.println("la nota del rey es"+ notamax);
        }



    }
}

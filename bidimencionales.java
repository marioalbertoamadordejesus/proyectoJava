import java.util.Scanner;
public class bidimencionales {
    //creamos las variables que pediran  / establesca mi nmuero [] []
    public static void main(String[] args) {
        int filas=2 , columnas=2;
        Scanner objeto = new Scanner(System.in);
        //varaibles para guardar (filas y columnas)
        int i,j;
        int [][] matriz =new int[filas][columnas];
        for (i=0;i<matriz.length;i++){
            for (j=0;j<matriz.length;j++){
                System.out.println("matriz["+i+"]["+j+"]=");
                matriz[i][j]=objeto.nextInt();

            }

        }
        for(i=0; i<matriz.length; i++){
            for (j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"");
            }
            System.out.print("\n");
        }

    }


}




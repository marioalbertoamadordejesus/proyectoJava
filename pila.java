import javax.swing.JOptionPane;
import java.util.Arrays;
public class pila {
    public static void main(String[] args) {
        int n= 5,m;
        long[] numeros = new long[n];

        int i;
        for (i=0;1 < numeros.length; i++);{
            m=i+1;
            numeros[i] =Long.valueOf(JOptionPane.showInputDialog("ingrese un valor"));

        }
        JOptionPane.showMessageDialog( null,Arrays.toString(numeros));



    }




}

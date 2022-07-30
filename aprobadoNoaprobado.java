import javax.swing.JOptionPane;

public class aprobadoNoaprobado {
    public static void main(String[] args) {

        double cal1, cal2, cal3, cal4, promedio;

        cal1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu primer calificacion"));
        cal2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu segunda calificacion"));
        cal3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu tercera calificacion"));
        cal4 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu Cuarta calificacion"));

        promedio= (cal1+cal2+cal3+cal4)/4;

        if (promedio==10){
            JOptionPane.showMessageDialog(null,"Aprobaste");
        } else if (promedio<10) {
            JOptionPane.showMessageDialog(null,"Reporbaste");
        }


    }

}




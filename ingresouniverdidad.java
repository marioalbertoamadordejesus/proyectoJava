import javax.swing.JOptionPane;
public class ingresouniverdidad {
    public static void main(String[] args) {
        int calificacion;
        System.out.println("calificacion");
        calificacion = Integer.parseInt(JOptionPane.showInputDialog("cual es tu calificacion"));
        if (calificacion >= 8){
            System.out.print("estas aceptado");
        }
        else if (calificacion <=8){
            System.out.println("sigue intentando");
        }

    }
}

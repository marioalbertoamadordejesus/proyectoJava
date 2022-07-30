import javax.swing.JOptionPane;
public class operaciones {
    //atributos
    int num1,num2;
    int suma,resta,division;
    // metodo que pedir los valores
    public void pedirdatos(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingresa tu primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingresa tu segundo numero"));
    }
    //metodos
    public void suma(){
        suma=num1+num2;
    }
    public void resta(){
        resta=num1-num2;
    }
    public  void division(){
        division=num1/num2;
    }
    public void resultado(){
        System.out.println("la suma es"+suma);
        System.out.println("la resta es"+resta);
        System.out.println("la division es"+division);
    }

    public static void main(String[] args) {
        operaciones op= new operaciones();
        op.pedirdatos();
        op.division();
        op.suma();
        op.resta();
        op.resultado();

    }
}

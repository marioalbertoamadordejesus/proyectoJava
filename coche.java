public class coche {
    //atributo
    String color, marca, modelo;

    public static void main(String[] args) {
        //objeto
        coche coche1= new coche();
        coche1.color="verde";
        coche1.marca="Nissan";
        coche1.modelo="2022";
        System.out.println("el coche de color"+coche1.color+"la marca es"+coche1.marca+"y modelo es"+coche1.modelo);
    }
}

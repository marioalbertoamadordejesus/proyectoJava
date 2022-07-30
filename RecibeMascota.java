import java.util.ArrayList;
public class RecibeMascota {
    //atributos
    String NombrePerro, edad,raza,tamano,nombrededueno;

    public static void main(String[] args) {
        ArrayList<RecibeMascota> perrosActuales= new ArrayList();
        RecibeMascota estetica= new RecibeMascota();


        estetica.NombrePerro="maya";
        estetica.edad="2";
        estetica.tamano="chico";
        estetica.nombrededueno="luisa";
        perrosActuales.add(estetica);
        estetica.NombrePerro="diego";
        System.out.println("el total de perros es"+perrosActuales.size());
        estetica.NombrePerro="diego";
        estetica.edad="2";
        estetica.tamano="chico";
        estetica.nombrededueno="luisa";
        perrosActuales.add(estetica);
        System.out.println("el total de perros es"+perrosActuales.size());
    }
}

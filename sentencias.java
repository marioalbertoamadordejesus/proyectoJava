public class sentencias {
    public static void main(String [] args) {
        int edad = 16;
        if (edad >= 18) {
            System.out.println("eres mayor de Edad");
        } else if (edad >= 15 && edad <= 17) {
            System.out.println("eres un adolecente");
        } else {
            System.out.println("eres menor de edad");
        }
        //clima
        int temperatura = 45;
        boolean lluvia = true;
        if (temperatura >= 19) {
            System.out.println("no uses chamarra\n");
        } else {
            System.out.println("abrigate bien\n");
        }
        //bucle for = interacciones
        int numero = 0;
        int suma = 1;
        for (int i = 1; i <= 5; i++) {
            suma += 1;
            System.out.println("la suma es:" + suma);
        }
        int numeros = 1;
        int sumas = 0;
        for (int i = 1; i <= 12; i++) {
            sumas = numeros + i;
            System.out.println(sumas + "\n");
        }
        double costoArticulo = 30.99;
        boolean listoEnivar = false;
        if (costoArticulo >= 24.1) {
            System.out.println("el valor es alto");
        } else {
            System.out.println("el precio es barato");
        }

        //debemos mostar los numeros del 1-10 con bucle while
        int nume = 0;
        int sum = 0;
        while (nume <= 10) {
            System.out.println(nume);
            nume += 1;
        }
        //utilizando do-while
        int a = 0;
        do {
            System.out.println(a);
            a++;
        }
        while (a < 5);
        // break , continue
        for (int i = 0; 1 < 10; i++) {
            System.out.println(i);
            if (i == 4) {
                break;
            }


            for (int h= 0; h < 10; h++) {
                System.out.println(h);
                if (h == 5) {
                    continue;
                }
            }
        }
        //serie de Fibonacci usando for
        int serie=15, valor1=0,valor2=1,siguiente;
        System.out.println(valor1+"\n"+valor2);
        for (int i=1;i<serie;i++){
            siguiente=valor1+valor2;
            System.out.println(siguiente);
            valor1=valor2;
            valor2=siguiente;
        }
    }}

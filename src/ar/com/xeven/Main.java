package ar.com.xeven;
/*
Crea una clase Fraccion con métodos para sumar, restar, multiplicar y dividir fracciones.
 */
public class Main {

    public static void main(String[] args) {

        //se crean 4 fracciones
        Fraccion fraccion1 = new Fraccion(1,4); //constructor con 2 parametros
        Fraccion fraccion2 = new Fraccion(1,2); //constructor `con 2 parametros
        Fraccion fraccion3 = new Fraccion();//constructor vacio-> num=0 y den=1
        Fraccion fraccion4 = new Fraccion(4); //constructor con 1 parametro; den=1

        //operaciones aritmeticas con las fracciones
        Fraccion suma = fraccion1.sumarFracciones(fraccion2);
        Fraccion resta = fraccion1.restarFracciones(fraccion3);
        Fraccion producto = fraccion1.multiplixarFracciones(fraccion4);
        Fraccion cociente = fraccion1.dividirFracciones(fraccion2);

        //Mostrar resultados
        System.out.println(fraccion1+" + "+fraccion2+" = "+suma);
        System.out.println(fraccion1+" - "+fraccion3+" = "+resta);
        System.out.println(fraccion1+" * "+fraccion4+" = "+producto);
        System.out.println(fraccion1+" / "+fraccion2+" = "+cociente);
    }
}

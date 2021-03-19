package ar.com.xeven;

public class Fraccion {
    //atributos
    private Integer numerador;
    private Integer denominador;

    //Constructor 1 por defecto, sin parametros
    //num=0; den=1, por defecto
    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    //Constructor 1 con 1 solo parametro que sera el valor del num
    //den=1 por defecto
    public Fraccion(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }

    //Constructor 3 con 2 parametros
    public Fraccion(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //getters y setters
    public Integer getNumerador() {
        return numerador;
    }

    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    public Integer getDenominador() {
        return denominador;
    }

    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }

    //Metodo que suma las fracciones
    public Fraccion sumarFracciones(Fraccion fraccion){
        Fraccion fraccionAux = new Fraccion();
        fraccionAux.numerador = (this.numerador*fraccionAux.denominador) + (fraccionAux.numerador*this.denominador);
        fraccionAux.denominador = this.denominador*fraccionAux.denominador;
        fraccionAux.simplificar(); //se simplifica antes de devolverla
        return fraccionAux;
    }

    //Metodo que resta fracciones
    public Fraccion restarFracciones(Fraccion fraccion){
        Fraccion fraccionAux = new Fraccion();
        fraccionAux.numerador = (this.numerador*fraccionAux.denominador) - (fraccionAux.numerador*this.denominador);
        fraccionAux.denominador = this.denominador*fraccionAux.denominador;
        fraccionAux.simplificar();
        return fraccionAux;
    }

    //Metodo que multiplica fracciones
    public Fraccion multiplixarFracciones(Fraccion fraccion){
        Fraccion fraccionAux = new Fraccion();
        fraccionAux.numerador = this.numerador*fraccionAux.denominador;
        fraccionAux.denominador = this.denominador*fraccionAux.denominador;
        fraccionAux.simplificar();
        return fraccionAux;
    }

    //Metodo que divide fracciones
    public Fraccion dividirFracciones(Fraccion fraccion){
        Fraccion fraccionAux = new Fraccion();
        fraccionAux.numerador = (this.numerador*fraccionAux.denominador);
        fraccionAux.denominador = this.denominador*fraccionAux.numerador;
        fraccionAux.simplificar();
        return fraccionAux;
    }
    
    //metodo que simplifica las fracciones
    private void simplificar() {
        int valor = mcd(); //se calculo el mcd de la fraccion
        numerador = numerador/valor;
        denominador = denominador/valor;
    }

    //Metodo que calcula el maximo comun divisor por el algoritmo de Euclides
    private int mcd() {
        int num = Math.abs(numerador); //valor absoluto del numerador
        int den = Math.abs(denominador); //valor absoluto del denominador
        if (den==0){
            return num;
        }
        int resto;
        while (den!=0){
            resto = num % den;
            num = den;
            den = resto;
        }
        return num;
    }

    //Metodo para mostrar las fracciones
    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }


}

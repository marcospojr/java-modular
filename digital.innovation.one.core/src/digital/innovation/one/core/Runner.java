package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.sum(25,40));
        System.out.println("Sub: " + calculadora.sub(40,25));
        System.out.println("Mult: " + calculadora.mult(25,40));
        System.out.println("Divisão: " + calculadora.div(25,5));
    }
}

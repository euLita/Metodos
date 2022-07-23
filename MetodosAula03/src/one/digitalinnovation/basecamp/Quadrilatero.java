package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 3 de Métodos;
 */

public class Quadrilatero {

    public static double area (double lado) {
        return lado * lado;
    }

    public static double area (double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area (double baseMaior, double baseMenor, double altura) {
        return ((baseMenor+baseMaior)*altura)/2;
    }

//    Exemplo de retorno (return) incompátivel
//    public static long abc () {
//        return 1.6;
//    }

}

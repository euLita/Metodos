package one.digitalinnovation.basecamp;

/**
 * Classe principal;
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(" Exercitando aula 3 - Retornos. ");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println(" Área do quadrado: " + areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println(" Área do retângulo: " + areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println(" Área do trapézio: " + areaTrapezio);

    }
}

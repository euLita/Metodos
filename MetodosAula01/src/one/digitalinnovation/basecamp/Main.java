package one.digitalinnovation.basecamp;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício calculadora: ");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println("Exercício mensagem: ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Exercício emprestimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}

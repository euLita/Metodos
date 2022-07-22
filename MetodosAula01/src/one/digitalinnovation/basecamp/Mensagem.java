package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */

public class Mensagem {

    // Este metodo recebe apenas 1 parâmetro - int hora;
    public static void obterMensagem(int hora) {

        // Vários métodos um dentro do outro, muito comum;
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 01:
            case 02:
            case 03:
            case 04:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora Inválida!");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println(" Bom dia! ");
    }

    public static void mensagemBoaTarde() {
        System.out.println(" Boa Tarde! ");
    }

    public static void mensagemBoaNoite() {
        System.out.println(" Boa Noite! ");
    }
}
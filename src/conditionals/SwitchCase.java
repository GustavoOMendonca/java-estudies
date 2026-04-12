public class SwitchCase {
    public static void main(String[] args) {
        int dia = 7;

        // Verifica o valor de "dia" e imprime uma mensagem de acordo com o valor
        // Se for 1 ou 7, imprime "Final de semana"
        // Se for qualquer outro valor entre 2 e 6, imprime "Dia útil"
        // Caso contrário, imprime "Valor inválido"
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;

            default:
                System.out.println("Valor inválido");
                break;
        }

        String comando = "start";
        // Verifica o valor de "comando" e imprime uma mensagem de acordo com o valor
        // Se for "start", imprime "Iniciando sistema"
        // Se for "stop", imprime "Parando sistema"
        // Caso contrário, imprime "Comando desconhecido"
        switch (comando) {
            case "start":
                System.out.println("Iniciando sistema");
                break;

            case "stop":
                System.out.println("Parando sistema");
                break;

            default:
                System.out.println("Comando desconhecido");
        }
    }
}


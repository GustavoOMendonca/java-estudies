package basics.conditionals;

public class IfElse {
    public static void main(String[] args) {
        int numero = 10;

        // Verifica se o numero e positivo, negativo ou zero
        if (numero > 0) {
            // Se for maior que zero, imprime que e positivo
            System.out.println("O numero e positivo.");
        } else if (numero < 0) {
            // Se for menor que zero, imprime que e negativo
            System.out.println("O numero e negativo.");
        } else {
            // Se for igual a zero, imprime que e zero
            System.out.println("O numero e zero.");
        }

        int idade = 25;
        // Verifica se a idade e maior ou igual a 18
        if (idade >= 18) {
            // Se for maior ou igual a 18, pode beber
            System.out.println("Pode beber");
        } else {
            // Se nao for maior ou igual a 18, nao pode beber
            System.out.println("Nao pode beber");
        }
    }
}
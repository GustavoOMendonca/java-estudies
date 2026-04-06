package basics;

public class OperadoresBasicos {

    public static void main(String[] args) {

        // =====================
        // Operadores aritméticos
        // =====================
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("Soma: " + (numero2 + numero1));
        System.out.println("Subtração: " + (numero2 - numero1));
        System.out.println("Divisão: " + (numero2 / numero1));
        System.out.println("Multiplicação: " + (numero2 * numero1));

        // =====================
        // Operador de resto (%)
        // =====================
        int resto = 20 % 2;
        System.out.println("Resto da divisão: " + resto);

        // =====================
        // Operadores relacionais
        // =====================
        System.out.println(numero1 > numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 >= numero2);
        System.out.println(numero1 <= numero2);
        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);

        // =====================
        // Operadores lógicos
        // =====================

        // &&
        int idade = 35;
        double salario = 2500.0;

        boolean maiorDeIdade = idade >= 18;
        boolean salarioDentroDaFaixa = salario >= 2500.0;
        boolean dentroDaRegra = maiorDeIdade && salarioDentroDaFaixa;

        System.out.println("Maior de idade e salário >= 2500? " + dentroDaRegra);

        // ||
        double valorContaCorrente = 200.0;
        double valorContaPoupanca = 10000.0;
        double valorPlay5 = 5000.0;

        boolean play5Compravel = valorContaCorrente >= valorPlay5 || valorContaPoupanca >= valorPlay5;

        System.out.println("Pode comprar o PlayStation 5? " + play5Compravel);

        // !
        boolean isVerdadeiro = true;
        boolean isFalso = false;

        System.out.println("!isVerdadeiro = " + !isVerdadeiro);
        System.out.println("!isFalso = " + !isFalso);

        // =====================
        // Operadores de atribuição
        // =====================
        double bonus = 1800.0;

        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println("Bônus final: " + bonus);

        // =====================
        // Operadores unários
        // =====================
        int contador = 0;

        contador++; // pós-incremento
        contador--; // pós-decremento
        ++contador; // pré-incremento
        --contador; // pré-decremento

        System.out.println("Valor do contador: " + contador);
    }
}
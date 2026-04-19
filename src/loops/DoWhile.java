package loops;
public class DoWhile {
    public static void main(String[] args) {

        // Inicializa a variável com o valor 1
        int numero = 1;

        do {
            // Verifica se o número é par
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else {
                System.out.println(numero + " é ímpar");    
            }

            // Incrementa o valor da variável
            numero++;

        } while (numero <= 5); // Enquanto o número for menor ou igual a 5, faça o loop

        // Final do programa
        System.out.println("Fim!");
    }
}

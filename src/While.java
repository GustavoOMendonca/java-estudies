public class While {
    public static void main(String[] args) {
        int i = 0;
        // Enquanto i for menor que 15, faça o loop
        while (i < 15) {
            // Verifica se o numero i e par
            if (i % 2 == 0) {
                System.out.println("O numero " + i + " e par");
            } 
            // Verifica se o numero i e multiplo de 3
            else if (i % 3 == 0) {
                System.out.println("O numero " + i + " e multiplo de 3");
            } 
            // Verifica se o numero i e multiplo de 5
            else if (i % 5 == 0) {
                System.out.println("O numero " + i + " e multiplo de 5");
            } 
            // Se nenhuma das condicoes acima for verdadeira, imprime que o numero nao e par, multiplo de 3 nem de 5
            else {
                System.out.println("O numero " + i + " nao e par, multiplo de 3 nem de 5");
            }
            // Incrementa o valor de i em 1
            i++;
        }
    }
}

package basics;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos (tipos que guardam na memória valores simples)
        //São eles : int, double, float, char, byte, short, long, boolean

        int idade = 10;
        double salarioDouble = 2000.0D;
        long numeroGrande = 100000L;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean isVerdadeiro = true;
        boolean isFalso = false;
        char caractere = 'M'; // caso sejam adicionadas letras, ele vai converter usando a tabela ascii ex: 65 vai retornar A
        String nome = "Fulano";

        System.out.println("A idade é "+idade);
        System.out.println(numeroGrande);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(isVerdadeiro);
        System.out.println(isFalso);
        System.out.println(caractere);
        System.out.println(nome);
        System.out.println(salarioDouble);

    }
}
// OBS: string não é um tipo primitivo, é uma classe, exemplo de escrita -> String nome = "textãoooooooooooooooo"
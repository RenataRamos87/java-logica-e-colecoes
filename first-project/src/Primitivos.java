public class Primitivos {
    public static void main(String[] args) {

        int minhaIdade = 34;
        String meuNome = "Renata";
        var nomeVariavel = "Re";

        // Tipos primitivos - inteiros
        // byte 8 bits (-128 a 127)
        // short 16 bits (-32.768 a 32.767)
        // int 32 bits
        // long 64 bits (precisa do L no final)

        // Tipos primitivos - reais
        // float 32 bits (precisa do f no final)
        // double 64 bits

        // Outros tipos primitivos:
        // char -> caractere único entre aspas simples
        // boolean -> true ou false

        byte b = 100;
        short c = 10000;
        int d = 1000000;
        long e = 1000000000L;
        float f = 10.5f;
        double g = 10.5;
        char h = 'n';
        String str = "Re";
        boolean bool = true;

        // Condicional simples
        if (b >= 99) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }
    }
}

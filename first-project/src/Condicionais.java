public class Condicionais {
    public static void main(String[] args) {

        // 1. If simples
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        // 2. If-Else
        int numero = 5;
        if (numero % 2 == 0){
            System.out.println("Número par");
        }else {
            System.out.println("Número ímpar");
        }

        // 3. If-Else If-Else
        int nota = 75;
        if (nota >= 90) {
            System.out.println("Aprovado com excelência");
        } else if (nota >= 60) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // 4. If com boolean
        boolean estaLogado = true;
        if (estaLogado) {
            System.out.println("Bem-vindo de volta!");
        } else {
            System.out.println("Faça login para continuar.");
        }

        // 5. If aninhado (um if dentro do outro)
        int idade2 = 20;
        boolean temCarteira = true;

        if (idade2 >= 18) {
            if (temCarteira) {
                System.out.println("Pode dirigir.");
            } else {
                System.out.println("Precisa de carteira de motorista.");
            }
        } else {
            System.out.println("Ainda é menor de idade.");
        }
    }
}

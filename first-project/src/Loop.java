import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {

        // Criando uma lista com nomes
        ArrayList<String> namesArray = new ArrayList<>();
        namesArray.add("Renata");
        namesArray.add("Bob");
        namesArray.add("Carol");

        // Loop for para percorrer a lista
        // i começa em 0 e vai até o tamanho da lista - 1
        // i++;  é o mesmo que: i = i + 1;

        for (int i = 0; i < namesArray.size(); i++) {
            // Imprime o nome da posição atual
            System.out.println(namesArray.get(i)); // vai imprimir 0, 1, 2, 3, 4
        }

        for (String name : namesArray){
            System.out.println(name);
        }

        // FOR ENQUANTO, WHILE ATẼ QUE CERTA CONDICAO SEJA EXIBIDA
        int contador = 0;
        while (contador <= 10){
            System.out.println("Estou no while");
            contador ++;
        }
    }
}

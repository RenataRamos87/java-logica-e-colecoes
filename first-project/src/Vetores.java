import java.util.ArrayList;

public class Vetores {
    public static void main(String[] args) {

        // VETORES (arrays fixos)
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5, 6};
        System.out.println(colecaoDeInteiros[2]);           // Acessar valor no índice 2
        System.out.println(colecaoDeInteiros.length);       // Ver o tamanho do array

        // Declarar array com tamanho fixo
        int[] myNumbers = new int[10];                      // array de inteiros com 10 posições

        // Preencher array de Strings manualmente
        String[] names = new String[10];
        names[0] = "Renata";
        names[1] = "Newton";
        names[2] = "Wakanda";

        // USANDO ARRAYLIST (lista dinâmica)
        ArrayList<String> namesArray = new ArrayList<>();
        namesArray.add("Renata");
        namesArray.add("Bob");
        namesArray.add("Carol");

        // Acessar elemento com .get()
        System.out.println(namesArray.get(2)); // Carol

        // Remover elementos
        // System.out.println(namesArray.remove(0)); // opcional: remover "Renata" e mostrar
        namesArray.remove("Carol"); // remove pelo nome

        // Mostrar todos os nomes com System.out.println (vai mostrar como lista)
        System.out.println(namesArray); // [Bob]

        // Exibir cada nome em uma linha
        for (String name : namesArray) {
            System.out.println(name);
        }
    }
}

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int MinhaIdade = 34;
        String MeuNome = "Renata";
        var nomeVariavel = "Re";


        //Tipos primitivos - inteiros
        // int
        // byte 8bits 128 a 127
        // short 16bits 32.768 a 32.767
        // int 32 bits
        // long 64 bits

        // Tipos primitivos - Real
        // float 32 bits
        // double 64 bits

        // Tipos primitivos:
        // char meuChar = 'um'
        // String "duṕlas"
        // boolean = true ou false

        byte b = 100;
        short c = 10000;
        int d = 1000000;
        long e = 1000000000L;
        float f = 10.5f;
        double g = 10.5;
        char h= 'n';
        String str = "Re";
        boolean bool = true;


        //Condicional
        if (b>=99){
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }



        // VETORES

        int[] colecaoDeInteiros = {1,2,3,4,5,6};
        System.out.println(colecaoDeInteiros[2]);
        //VERIFICAR O TAM DO VETOR
        System.out.println(colecaoDeInteiros.length);
        //INDICAR TAM DO VETOR
        int [] myNumberns = new int[10];
        //AQUI VC PRECISA INDICAR O TAM DO VETOR E A POSIÇAÕ
        String[] names = new  String[10];
        names[0] = "Renata";
        names [1] = "Newtom";
        names [2] = "Wakanda";


        //COM ARRAY LIST QUE É UMA CLASSE DO JAVA NAO PRECISA
        ArrayList<String> namesArray = new ArrayList<>();
        namesArray.add("Renata");
        namesArray.add("Bob");
        namesArray.add("Carol");

        //CHAMANDO O ARRAY, NESTE CASO UTILIZA-SE O .GET
        System.out.println(namesArray.get(2));

        //REMOVER O INDICE 2 FORMAR COM E SEM APONTAR O INDICE
        //System.out.println(namesArray.remove(0));
        namesArray.remove("Carol");

        //MOSTRAR TODOS OS NOME QUE ESTÃO NO ARRAY
        System.out.println(namesArray);
        //EXIBIR CADA NOME EM UMA LINHA
        for (String name : namesArray){
            System.out.println(name);
        }
    }
}





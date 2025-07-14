import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🟡 Variáveis primitivas (exemplos comentados)
        /*
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        char c = 'A';
        boolean bool = false;
        */

        // 🔡 String e número
        String str;
        double d = 20.5;

        // 🔢 Vetor de inteiros
        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};

        // 🔤 Vetor de Strings (fixo)
        String[] nomesDaLista = new String[8];
        nomesDaLista[0] = "Boa noite mãe";
        nomesDaLista[3] = "Tudo bem com a senhora?";
        nomesDaLista[7] = "Vai dormir dona Rita";

        System.out.println(nomesDaLista[0]);
        System.out.println(nomesDaLista[3]);
        System.out.println(nomesDaLista[7]);

        // 📋 ArrayList dinâmico
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Rafaela");
        nomes.add("Joao");
        nomes.add("Miguel");
        nomes.add("Juana");
        nomes.add("Natan");
        nomes.add("Caio");
        nomes.add("Erika");
        nomes.add("Bruna");
        nomes.add("Luana");

        // 🔍 Visualizando e removendo elementos do ArrayList
        System.out.println("Antes de remover: " + nomes.get(4)); // Natan
        nomes.remove(4); // remove "Natan"
        System.out.println("Depois de remover Natan: " + nomes.get(4)); // agora é "Caio"

        nomes.remove("Erika"); // remove pelo nome
        System.out.println("Depois de remover Erika: " + nomes.get(6)); // agora é "Luana"

        // 🧠 Entrada do usuário para condicional
        System.out.print("Digite algo: ");
        str = sc.nextLine();

        if (str.equals("gostoso")) {
            System.out.println("Vdd");
        } else if (str.equals("Luis")) {
            System.out.println("Você digitou Luis");
        } else {
            System.out.println("NO erro boy");
        }

        // 🔚 Imprimindo dados finais
        System.out.println("Terceiro valor do vetor: " + colecaoDeInteiros[2]);
        System.out.println("Tamanho do vetor: " + colecaoDeInteiros.length);
        System.out.println("Valor de d: " + d);

        sc.close();
    }
}

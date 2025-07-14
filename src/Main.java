import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args){
        //Variaveis do JAVA
        /*byte => 8 bits =>-128 a 127
            short => 16 bits => -32.768 a 32.767
            int => 32 bits =>
            
            */
        /*byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        char c = 'A';
        boolean bool = false;*/
        String str = "Luis";
        double d = 20.5;

        //VETORES
        int[] colecaoDeinteiros = {1,2,3,4,5};// vetor qu epode ser criado por qualquer variavel primitiva(int, float etc) {se vc usa chaves ja vem com o tanto de elementos dentro dele predefinido tipo {1,2,3...}}
        String[] nomesdaLista = new String[8];
        nomesdaLista[0] = "Boa noite mãe ";
        nomesdaLista[3]= "tudo bem com a senhora?";
        nomesdaLista[7] = "Vai dormir dona Rita";
        System.out.print(nomesdaLista[0]);
        System.out.println(nomesdaLista[3]);
        System.out.println(nomesdaLista[7]);

        //int []meusNUmeros = new int[40];//nesse tipo de vetor vc não precisa necessariamente preencher com os elementos, vc simplesmente define o valor  ex [40] esse vetor tem o tamanho de 40 entao 40 é o valor que ele vai possuir sem falar as posicoes dos elementos

        //ARRAY
        ArrayList<String> nomes = new ArrayList<>();// permite que vc adicione ou remova elementos de forma dinamica sem necessariamente declarar o tamanho dela e vc pode ir alterando o tamanho dela a sua vontade
        //POSICOES DO ARRAY
        nomes.add("Rafaela");//0
        nomes.add("Joao");//1
        nomes.add("Miguel");//2
        nomes.add("Juana");//3
        nomes.add("Natan");//4
        nomes.add("Caio");//5
        nomes.add("Erika");//6
        nomes.add("Bruna");//7
        nomes.add("Luana");//8
        System.out.println(nomes.get(4));//como printar um array
        //COMO REMOVER UM ARRAY
        nomes.remove(4);// se eu removo o indice 4 que é o Natan o indice 4 passa a ser o Caio
        System.out.println(nomes.get(4));//como printar um array
        System.out.println(nomes.get(6));//como printar um array
        nomes.remove("Erika");//vc tambem pode remover por objeto
        System.out.println(nomes.get(6));//como printar um array



        //CONDICIONAIS

        if (str =="Luis"){
            System.out.println("Vdd");
        //} else if (str.equals("Luis")) {
            System.out.println(d);        }
        else {
            System.out.println("NO erro boy");
        }
        System.out.println(colecaoDeinteiros[2]);
        System.out.println(colecaoDeinteiros.length);

    }


}
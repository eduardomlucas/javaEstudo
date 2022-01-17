import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        //String[] <= array com valores fixos
        //ArrayList<String>() <= array dinamico [ñ sabe a quantidade de elementos]

        List<String>names = new ArrayList<>();
        //add elementos no array;
        names.add("Nome1");
        names.add("Nome2");
        names.add("Nome3");
        names.add("Nome4");

        //método get pega o indice do array dentro do for
        //e mostrar o valores do array
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //retornar o valor do index
        //compara o valor dentro do array com o "indexOf"
        int index = names.indexOf("Nome2");
        System.out.println(index);

        //vai pegar o index da mesma forma, mas com a função "indexOf" dentro do print
        //buscar o indice por um elementos
        System.out.println(names.indexOf("Nome2"));

        //método para verificar se o array esta vazio
        System.out.println(names.isEmpty()); //<-- false

        //verificar se a lista contem algum elemento específico
        //compara o valor do "contains" com os valores de dentro do array
        System.out.println(names.contains("Nome4")); // <--true
        System.out.println(names.contains("Nome7"));// <-- false

        //verificar o tamanho da lista de
        System.out.println(names.size()); // <-- quantidade de valores inseridos

        //remover todos elementos da  lista
        names.clear();
        System.out.println(names.toString()); // <-- sem valores mas ainda existe
        System.out.println(names.isEmpty()); // <-- true
    
    }
}

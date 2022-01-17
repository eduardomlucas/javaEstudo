import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        //ordenação de elemtos de um array
        List<String>names = new ArrayList<>();
        //add elementos no array;
        names.add("Nome3");
        names.add("Nome1");
        names.add("Nome4");
        names.add("Nome2");

        Collections.sort(names);

        //foreach(na mão)
        for(String name: names){
            System.out.println(name);
        }
    }
}

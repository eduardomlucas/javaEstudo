import java.util.Arrays;

public class Main4 {
    public static void main(String[] args){
        
        String names[] = new String[10];
        System.out.println(Arrays.toString(names));

        Arrays.fill(names,"Desconhecido");
        //utilizando o "Arrays.fill(names, "VALOR")"
        //preenchimento do array com todos os valores iguais
        System.out.println(Arrays.toString(names));
    }
}

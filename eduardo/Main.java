import java.util.Scanner;
//código da sequencia fibonacci
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int f1 = 0;
            int f2 = 1;

            int limit = input.nextInt();
            //enquanto o segundo valor for menor que o limit (q vai ser pego pelo usuário)
            //vai ser somado o primeiro valor com o segundo até que a soma chegue ao limite
            //após isso, o f1 vai ser igual ao f2 e o f2 passa ser o limite com
            //pra que possa continuar somando de maneira certa
            while(f2 < limit){
                int fn = f1 + f2;
                if(fn > limit)
                    {break;}
                 
                System.out.println(fn);
                f1 = f2;
                f2 = fn;    
            }
        }

    }    
}

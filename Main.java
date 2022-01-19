import java.util.ArrayList;

//import obj.Carro;
import obj.Funcionario;

public class Main{
    public static void main(String[] args){
        //criando usuário setando manualmente

        // ArrayList<Carro> carros = new ArrayList<Carro>();
        //  carros.add(new Carro("aaa-1234",2012, 1234567890, "uno", "Fiat", 4));
        //  carros.add(new Carro("bbb-4321",2021, 1987654321, "gol","Wolksvagen", 2));

        // for (Carro carro : carros){
        //     System.out.println(carro.toString());
        //     System.out.println("--------------------------------");
        // }

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario(00000000000,"Eduardo",21,000,"TI","Programador"));
        funcionarios.add(new Funcionario(00000000001,"Lucas",21,001,"Cozinha","Faxineiro"));
        for(Funcionario f : funcionarios){
            System.out.println(f.toString());
            System.out.println("--------------------------------");
        }
        


    }

    
}
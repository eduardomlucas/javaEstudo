package edu.ardo;
// importações
import java.util.ArrayList;
import java.util.List;



// arrays dinamicos usando lista no java
    // mesmo setando um valor limite pra inserção de valores pode passar o limite adicionando um novo elemento no "array"
    //lista usada como array
    //cresce conforme for adicionando


public class App {
    public static void main(String[] args) throws Exception {
        List<User> users = new ArrayList<>();

        int i = 0;
        while( i < 10) {
            User actual = new User("Nome "+ i, "Sobrenome " + i);
            users .add(actual);
            i++;
        }

        System.out.println(users.get(9).getFirstName());
        System.out.println(users.get(9).getLastName());

        User user11 = new User("Nome 11", "Sobrenome 11");
        users.add(user11);
            
        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName()); 
    }

}

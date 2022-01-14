package edu.ardo;

public class App {
    public static void main(String[] args) throws Exception {
        User[] users = new User[]{
            new User ("John", "Lennon"),
            new User ("João", "Leno"),
            new User ("Maria", "Naz"),
        };
    

        System.out.println(users[0].getFirstName());
        System.out.println(users[0].getLastName());
    }

}

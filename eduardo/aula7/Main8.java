package aula7;

public class Main8 {
    public static void main(String[] args) {
        User userA = new User("Eduardo", "Lucas");
        User userB = new User("Eduardo","Lucas");

        // System.out.println(userA.getFirstName());
        // System.out.println(userA.getLastName());

        //System.out.println(userA.toString());

        System.out.println(userA.hashCode());
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));
        
    }
}

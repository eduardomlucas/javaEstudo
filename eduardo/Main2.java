import java.util.Arrays;
//sort usando hash code 

public class Main2 {
    public static void main(String[] args){
        int [] numbers = new int []{10, 30, 3,2,1,5,2,3,10};

        Arrays.sort(numbers);

        System.out.println(numbers); // <-- hashcode int [] (Id)

        System.out.println(Arrays.toString(numbers)); // <-- toString para transformar o hash em string
    }
}

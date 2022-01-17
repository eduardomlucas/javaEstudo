import java.util.Arrays;

public class Main3{

    public static void main(String[] args){
        //comparando arrays

        int [] numbersA = new int []{1,2,3};

        int [] numbersB = new int []{1,2,3}; 
        // teste para ver se o hashcode é o mesmo para  ;
        // mesmo com valores iguais o id do array é diferente;

        //int [] numbersB = numbersA;
        //agora teste fazendo um "ponteiro"
        //o array B vai apontar para o array A

        System.out.println(numbersA == numbersB);
        System.out.println(numbersA.equals (numbersB));
        System.out.println(numbersA+ " " + (numbersB)+ "\n");

        System.out.println(Arrays.equals(numbersA, numbersB));
        //usando o "Arrays.equals(numbersA, numbersB)"
        //vai comparar os valores dentro do array

         
    }
}
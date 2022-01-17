package aula7;

//classe padrão de um usuário
public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    //função q vai imprimir o primeiro nome + o segundo nome
    public String output(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    //o mesmo método output mas comn diferenças
    //ao invés de pegar os dois nomes, apenas o primeiro será pego
    //o parâmetro dentro da mesma função define a diferença do método
    //o if vai testar a função se vai ser passada com parâmetro ou não
    public String output(boolean showLastName){
        if(showLastName){
            return output();
        }
        else{
            return firstName;
        }  
        
    }

    //configuração do toString()
    //sobrecarga do método toString
    ///criando um novo padrão para o toString 
    public String toString(){
        return "Primeiro Nome: " + firstName +"\nÚltimo Nome: " + lastName;
    }


}

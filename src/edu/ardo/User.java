package edu.ardo;

public class User {

    //propriedades (PRIVATE)
    private String firstName;
    private String lastName;

    //construtor
    public User(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName;
    }

    //SETTER
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //GETTER
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName() {
        return lastName;
    }
}

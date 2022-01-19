package obj;
//classe abstrata
//utilização de atributos e métodos apenas para ser herdada

abstract class User {
    protected long cpf;
    protected String nome;
    protected int idade;

    //BUILDER
    public User(int cpf, String nome, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
    //GETTER/SETTER
    public long getcpf(){
        return cpf;
    }
    public void setcpf(long cpf){
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
  
}

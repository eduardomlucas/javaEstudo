package obj;

public class Funcionario extends User implements NormasCovid{
    private int id;
    private String departamento;
    private String cargo;

    //BUILDER
    public Funcionario(int cpf, String nome, int idade, int id, String departamento, String cargo) {
        super(cpf, nome, idade);
        this.id = id;
        this.departamento = departamento;
        this.cargo = cargo;
    }
    //GETTERS AND SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return this.departamento;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return this.cargo;
    }

    @Override
    public String toString() {
        return "informações do usuário: \nnome: " + nome+ "\ncpf: " + cpf +"\nidade: " 
                + idade +"\nid: " +id + "\ncargo: " + cargo + "\ndepartamento: " + departamento;
    }

    public void higienizar(){}
    public void assinarPontoEntrada(){}
    public void intervalo(){}
    public void assinarPontoSaida(){}

}

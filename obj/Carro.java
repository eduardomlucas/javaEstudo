package obj;

public class Carro extends Veiculo  {
    
    private String modelo;
    private String marca;
    private int portas;


    //builder
    public Carro(String placa, int ano, int doc, 
                String modelo, String marca, int portas){
        super(placa, ano, doc);
        this.modelo = modelo;
        this.marca = marca;
        this.portas = portas;
    }
    //GETTER/SETTER
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //toString
    @Override
    public String toString() {
        return "Informações do carro: " + modelo + "\nplaca: " + placa + "\nano: " + ano 
            + "\ndocumento: " + doc + "\nmarca: " + marca + "\nnúmero de portas: " + portas;
    }
}
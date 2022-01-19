package obj;
// classe pai de todos os veiculos
// usando uma classe "public", apenas p/ ver a funcionalidade
//usar uma classe abstrata como veículo

public class Veiculo {
    
        protected String placa;
        protected int ano;
        protected int doc;


        //CONSTRUTOR
        public Veiculo (String placa, int ano, int doc){
            this.placa = placa;
            this.ano = ano;
            this.doc = doc;
        }

        //GETTER/SET
        
        public String getPlaca(){
            return placa;
        }
        public void setPlaca(String placa) {
            this.placa = placa;
        }
        public int getDoc() {
            return doc;
        }
        public void setDoc(int doc) {
            this.doc = doc;
        }
        public int getAno() {
            return ano;
        }
        public void setAno(int ano) {
            this.ano = ano;
        }
        
        public String toString() {
            return "placa: " + placa + " ano: " + ano + " doc: " + doc;
        }    



    
}

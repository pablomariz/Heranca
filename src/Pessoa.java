public class Pessoa {

    private String nome; 
    private String endereco; 
    private int telefone; 
    
    public Pessoa (String n, String e, int t) {
        this.setNome(n);
        this.setEndereco(e);
        this.setTelefone(t);
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setEndereco(String e) {
        this.endereco = e;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setTelefone(int t) {
        this.telefone = t;
    }
    
    public int getTelefone() {
        return this.telefone;
    }
}

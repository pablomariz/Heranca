public class Gerente extends Funcionario {
    
    public Gerente (String n, int m, String depResp) {
        super(n, m);
        this.setDepRes(depResp);
    }
    
    private String depResp;
    
    public void setDepRes (String depResp) {
        this.depResp = depResp;
    }
    
    public String getDepResp () {
        return this.depResp;
    }
    
}

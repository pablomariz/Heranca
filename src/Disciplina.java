public class Disciplina {
    
    public Disciplina (String nD, int cD) {
        this.setNomeD(nD);
        this.setCodigoD(cD);
    }
    
    private String nomeD;
    private int codigoD;
    
    public void setNomeD (String nD) {
        this.nomeD = nD;
    }
    
    public String getNomeD () {
        return this.nomeD;
    }
    
    public void setCodigoD (int cD) {
        this.codigoD = cD;
    }
    
    public int getCodigoD () {
        return this.codigoD;
    }
}

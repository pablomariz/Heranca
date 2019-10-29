public class AlunoEspec extends Aluno {
    
    public AlunoEspec (String n, int m, Graduacao g, PosGrad p){
        super(n, m);
        this.setGrad(g);
        this.setPosGrad(p);
    }
    
    private Graduacao graduacao;
    private PosGrad posgraduacao;
    
    public void setGrad (Graduacao g) {
        this.graduacao = g;
    }
    
    public Graduacao getGraduacao () {
        return this.graduacao;
    }
    
    public void setPosGrad (PosGrad p) {
        this.posgraduacao = p;
    }
    
    public PosGrad getPosGrad () {
        return this.posgraduacao;
    }
}

public class AlunoGrad extends Aluno {
    
    public AlunoGrad (String n, int m, Graduacao g) {
        super(n, m);
        this.setGrad(g);
    }
    
    private Graduacao graduacao;
    
    public void setGrad (Graduacao g) {
        this.graduacao = g;
    }
    
    public Graduacao getGraduacao () {
        return this.graduacao;
    }
}

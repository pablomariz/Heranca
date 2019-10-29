public class PosGrad extends Disciplina {

    private String professor;
    
    public void setProfessor (String pf) {
        this.professor = pf;
    }
    
    public String getProfessor () {
        return this.professor;
    }   
    
    
    public PosGrad (String nD, int cD, String pf) {
        super(nD, cD);
        this.setProfessor(pf);
    }
    
}

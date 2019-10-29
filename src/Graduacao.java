public class Graduacao extends Disciplina {
    
    public Graduacao (String nD, int cD, String pf) {
        super(nD, cD);
        this.setProfessor(pf);
    }
    
    private String professor;
    
    public void setProfessor (String pf) {
        this.professor = pf;
    }
    
    public String getProfessor () {
        return this.professor;
    }
}


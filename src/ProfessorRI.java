public class ProfessorRI extends Professor {
    
    double salario;
    
    public void setSalario(double s) {
        this.salario = s;
    }
    
    public double getSalario () {
        return this.salario;
    }
    
        public ProfessorRI(String n, int idade, int m, double s) {
        super(n, idade, m);
        this.setSalario(s);
    }
}

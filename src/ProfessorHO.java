public class ProfessorHO extends Professor {
    
    public ProfessorHO (String n, int idade, int m, double vHr) {
        super(n, idade, m);
        this.setValorHr(vHr);
    }
    
    double valorHr;
    
    public void setValorHr(double vHr){
        this.valorHr = vHr;
    }
    
    public double getValorHr () {
        return this.valorHr;
    }
    
    public double calcValorHrTotal (int hrTrab) {
        return this.valorHr * hrTrab;
    }
    
    
}

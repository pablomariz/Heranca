public class AssisAdm extends Funcionario {
    
    public AssisAdm (String n, int m, Gerente spv) {
        super(n, m);
        this.setSupervisor(spv);
    }
    
    Gerente supervisor;
    private double adcNoturno;
    
    public void setSupervisor (Gerente spv){
        this.supervisor = spv;
    }
    
    public Gerente getSupervisor () {
        return this.supervisor;
    }
    
    public void setAdcNoturno (double adcN) {
        this.adcNoturno = adcN;
    }
    
    public double getAdcNoturno () {
        return this.adcNoturno;
    }
    
}

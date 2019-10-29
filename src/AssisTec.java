public class AssisTec extends Funcionario {
    
    public AssisTec (String n, int m, Gerente spv){
        super(n, m);
        this.setSupervisor(spv);
    }
    
    Gerente supervisor;
    private double bonus;
    
    public void setSupervisor (Gerente spv){
        this.supervisor = spv;
    }
    
    public Gerente getSupervisor () {
        return this.supervisor;
    }
    
    public void setBonus (double b) {
        this.bonus = b;
    }
    
    public double getBonus () {
        return this.bonus;
    }
}

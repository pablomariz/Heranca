public class Operario extends Empregado {
    
    public Operario (String n, String e, int t, int cS, double sB, int iP, double vP, int c) {
        super (n, e, t, cS, sB, iP);
        this.setValorProducao(vP);
        this.setComissao(c);
    }
    
    private double valorProducao;
    private int comissao;
    
    public void setValorProducao (double vP) {
        this.valorProducao = vP;
    }
    
    public double getValorProducao () {
        return this.valorProducao;
    }
    
    public void setComissao (int c) {
        this.comissao = c;
    }
    
    public int getComissao () {
        return this.comissao;
    }
    
    @Override
    public double calcularSalario () {
        return this.getSalarioBase() - ((this.getSalarioBase() * this.getImposto()) / 100) + 
                (this.getSalarioBase() + ((this.valorProducao * this.comissao) / 100));
    }
    
}   
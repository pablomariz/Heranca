public class Fornecedor extends Pessoa {
    
    public Fornecedor (String n, String e, int t, double vC, double vD) {
        super(n, e, t);
        this.setValorCredito(vC);
        this.setValorDivida(vD);
    }
    
    private double valorCredito; 
    private double valorDivida;
    
    public void setValorCredito(double vC) {
        this.valorCredito = vC;
    }
    
    public double getValorCredito () {
        return this.valorCredito;
    }
    
    public void setValorDivida (double vD) {
        this.valorDivida = vD;
    }
    
    public double getValorDivida () {
        return this.valorDivida;
    }
    
    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }

}

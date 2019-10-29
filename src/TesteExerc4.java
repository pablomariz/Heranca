public class TesteExerc4 {
    
    public static void main(String[] args) {
        
        //Pessoa
        Pessoa p1 = new Pessoa ("Pablo", "Rua tal, bairro taltal, n 71", 123456789);
        //Fornecedor
        Fornecedor f1 = new Fornecedor("Joao", "Rua taltal, bairro tal, n 43", 123456789, 3000, 4000);
        //Empregado
        Empregado e1 = new Empregado("Ricardo", "Rua tal, bairro tal, n 9", 123456789, 127, 2500, 10);
        //Administrador
        Administrador a1 = new Administrador("Lucas", "Rua tal, bairro tal, n 90", 123456789, 125, 50000, 15, 5000);
        //Operário
        Operario op1 = new Operario("Omar", "Rua tal, bairro tal, n 233", 123456789, 123, 12000, 10, 15, 5);
        
        System.out.println("Saldo do fornecedor: " + f1.obterSaldo() + "\n");
        System.out.println("Cálculo do salário do empregado: " + e1.calcularSalario() + "\n");
        System.out.println("Cálculo do salário do administrador: " + a1.calcularSalario() + "\n");
        System.out.println("Cálculo do salário do operário: " + op1.calcularSalario());
        
    }
}

public class TestaEmpresa {
    
    public static void main(String[] args) {
        
        Gerente gt1 = new Gerente("Joao", 123443, "T.I");
        Gerente gt2 = new Gerente("Pablo", 3456789, "Gerente");
        
        AssisAdm assisAdm1 = new AssisAdm("Lucas", 564321, gt1);
        AssisTec assisTec1 = new AssisTec("Matheus", 890765, gt2);
        
        System.out.println("Assistente Administrativo:");
        System.out.println("Nome: "  + assisAdm1.getNome());
        System.out.println("Matrícula:" + assisAdm1.getMatricula() + "\n");
        System.out.println("Supervisor: " + assisAdm1.supervisor.getNome());
        System.out.println("Matrícula: " + assisAdm1.supervisor.getMatricula());
        System.out.println("Departamento: " + assisAdm1.supervisor.getDepResp() + "\n");
        
        System.out.println("Assistente Técnico:");
        System.out.println("Nome: "  + assisTec1.getNome());
        System.out.println("Matrícula:" + assisTec1.getMatricula() + "\n");
        System.out.println("Supervisor: " + assisTec1.supervisor.getNome());
        System.out.println("Matrícula: " + assisTec1.supervisor.getMatricula());
        System.out.println("Departamento: " + assisTec1.supervisor.getDepResp());
        
    }
}

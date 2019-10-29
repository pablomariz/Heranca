public class TestaUniversidadeExerc5 {
    
    //Graduaçao
    Graduacao g1 = new Graduacao("Redes", 123, "Daniel");
    //Pós Graduação
    PosGrad pG1 = new PosGrad("Java", 124, "Luciano");
    //Aluno Especial
    AlunoEspec aEspec1 = new AlunoEspec("Pablo", 125, g1, pG1);
    //Aluno de Graduação
    AlunoGrad aG1 = new AlunoGrad("Carlos", 126, g1);
    //Aluno de Pós Graduação
    AlunoPosGrad aPG1 = new AlunoPosGrad("Diego", 127, pG1);
}

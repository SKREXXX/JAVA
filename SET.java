
package pr.a3;
public class PrA3{
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Nan");
        p2.setNome("Nathalia");
        p3.setNome("NaAan");
        p4.setNome("Maew");
        
        p1.setSexo ("M");
        p4.setSexo("F");
        p2.setIdade(22);
        p3.setIdade(15);
        
        p3.setSalario(2545.54f);
        p2.setCurso("ADS DEV");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
          }
    
}

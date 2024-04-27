
package parametro.a3;
public class parametroa3{
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Natan");
        p2.setNome("Nathalia");
        p3.setNome("Nathan");
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
public class Pessoa extends parametroa3 {
    private String nome;
    private int idade;
    private String sexo;
    
    public void FazerAniversario(){
        this.idade ++ ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
         public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    
    public void cancelarMatr(){
    System.out.println("Matricula será cancelada!");
}

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
     
}
   
  public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum) {
    this.salario += aum; 
}

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
public class Funcionario extends Pessoa{
    public String setor;
    public boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando; 
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }  
}
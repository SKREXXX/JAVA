package Financeiro;

import Academico.Disciplina;

public class Boleto {
    private Aluno aluno;
    private String referencia; 
    private double valor; 

    public Boleto(Aluno aluno, String referencia, double valor){
        this.aluno = aluno;
        this.referencia = referencia;
        this.valor = valor;
    }

    public Aluno getAluno() { return aluno; }

    public String getReferencia() { return referencia; }

    public double getValor() { return valor; }

    public double desconto() { 
        disciplina = new Disciplina[3]; 
        if (disciplina) 
            valor -=  valor * 0.1;
            return valor;
        }
    }

    public double getValorDesconto() { 
        return valor; 
    }
}



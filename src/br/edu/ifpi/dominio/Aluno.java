package br.edu.ifpi.dominio;

import java.util.Date;

public class Aluno {
    private String nome;
    private String email;
    private Date dataDeNa;

    public Aluno(String nome, String email, Date dataDeNa) {
        this.nome = nome;
        this.email = email;
        this.dataDeNa = dataDeNa;
    }

    public String getnome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public Date getdataDeNa() {
        return dataDeNa;
    }

    @Override
    public String toString() {
        return "Aluno [dataDeNa=" + dataDeNa + ", email=" + email + ", nome=" + nome + "]";
    }

    

}

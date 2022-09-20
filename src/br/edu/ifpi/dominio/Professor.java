package br.edu.ifpi.dominio;

public class Professor {
    public String nome;
    public String email;
    public String formacao;

    public Professor(String nome, String email, String formacao) {
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor [email=" + email + ", formacao=" + formacao + ", nome=" + nome + "]";
    }
    
}
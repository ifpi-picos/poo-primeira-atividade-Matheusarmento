package br.edu.ifpi.dominio;
import java.util.Date;

public class Curso {
    public String nome;
    public int cargaHoraria;
    public String modalidade;
    public String nivel;
    public Date dataDeInicio;
    public Date dataDeFim;
    public boolean gratuito;
    public Professor professor;
    public String getNome() {
        return nome;
    }

    public Curso(String nome, int cargaHoraria, String modalidade, String nivel, Date dataDeInicio, Date dataDeFim,
            boolean gratuito, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.modalidade = modalidade;
        this.nivel = nivel;
        this.dataDeInicio = dataDeInicio;
        this.dataDeFim = dataDeFim;
        this.gratuito = gratuito;
        this.professor = professor;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String getModalidade() {
        return modalidade;
    }
    public String getNivel() {
        return nivel;
    }
    public Date getDataDeInicio() {
        return dataDeInicio;
    }
    public Date getDataDeFim() {
        return dataDeFim;
    }
    public boolean isGratuito() {
        return gratuito;
    }
    public Professor getProfessor() {
        return professor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public void setDataDeFim(Date dataDeFim) {
        this.dataDeFim = dataDeFim;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", dataDeFim=" + dataDeFim + ", dataDeInicio=" + dataDeInicio
                + ", gratuito=" + gratuito + ", modalidade=" + modalidade + ", nivel=" + nivel + ", nome=" + nome
                + ", professor=" + professor + "]";
    }
    
}
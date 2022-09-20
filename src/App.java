import java.util.Date;

import br.edu.ifpi.dominio.*;

import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Aluno aluno = new Aluno("Matheus Sarmento", "Email", sdf.parse("00/00/0000"));

        Professor professor = new Professor("Zeze", "Email", "Mestre");

        Curso curso = new Curso("ADS", 2000, "Presencial", "Superior", sdf.parse("00/00/0000"), sdf.parse("00/00/0000"), true, professor);

        Certificado certificado = new Certificado(aluno, curso);

        System.out.println(certificado);
    }
}
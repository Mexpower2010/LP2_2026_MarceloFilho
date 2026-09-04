package Questões.SistemaCursos;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aluno {
    private String nome;
    private String matricula;
    private Curso curso;
    private Turma turma;
    private String email;
    private double notaFinal;
    private double frequencia;
    private char status; // 'C' Cursando 'A' Aprovado 'R' Reprovado

    public Aluno() {
    }

    public Aluno(String nome, String matricula, Curso curso, Turma turma, String email, char status) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.turma = turma;
        this.email = email;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean emailValido = validarEmail(email);
        do {
        if (emailValido) {
            this.email = email;
            emailValido = false;
        } else {
            System.out.println("Email inválido. Por favor, insira um email válido.");
            email = new java.util.Scanner(System.in).next();
            emailValido = validarEmail(email);
        }   
        } while (emailValido);
    }
    public boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(email);
        return matcher.matches();
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", turma=" + turma + ", email="
                + email + ", notaFinal=" + notaFinal + ", frequencia=" + frequencia + ", status=" + status + "]";
    }

    
}

package Questões.SistemaCursos;
import java.util.ArrayList;
import java.util.List;
public class Professor {
    private String matricula;
    private String nome;
    private String email;
    private String titulacao;
    private List<Turma> turmasMinistradas = new ArrayList<>();

    public Professor(String matricula, String nome, String email, String titulacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.titulacao = titulacao;
        this.turmasMinistradas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public List<Turma> getTurmasMinistradas() {
        return turmasMinistradas;
    }

    public void setTurmasMinistradas(List<Turma> turmasMinistradas) {
        this.turmasMinistradas = turmasMinistradas;
    }

    @Override
    public String toString() {
        return "Professor [matricula=" + matricula + ", nome=" + nome + ", email=" + email + ", titulacao=" + titulacao
                + ", turmasMinistradas=" + turmasMinistradas + "]";
    }

}
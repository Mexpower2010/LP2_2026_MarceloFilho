package Questões.SistemaCursos;
import java.util.ArrayList;
import java.util.List;
public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private Curso curso;
    private List<Turma> turmas;

    public Disciplina(String codigo, String nome, int cargaHoraria, String ementa, Curso curso) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.curso = curso;
        this.turmas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setTurmas(Turma turmas) {
        this.turmas.add(turmas);
    }
    public List<Turma> getTurmas() {
        return turmas;
    }

    @Override
    public String toString() {
        return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", ementa="
                + ementa + ", curso=" + curso + ", turmas=" + turmas + "]";
    }
}
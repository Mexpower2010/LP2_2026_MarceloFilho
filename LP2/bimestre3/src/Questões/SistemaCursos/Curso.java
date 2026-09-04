package Questões.SistemaCursos;
import java.util.ArrayList;
import java.util.List;
public class Curso {
    private String codigo;
    private String nome;
    private int cargaHorariaTotal;
    private List<Disciplina> disciplinas;
    private List<Aluno> aluno;

    public Curso(String codigo, String nome, int cargaHorariaTotal) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorariaTotal = cargaHorariaTotal;
        this.disciplinas = new ArrayList<>();
        this.aluno = new ArrayList<>();
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

    public int getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public void setCargaHorariaTotal(int cargaHorariaTotal) {
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas.add(disciplinas);
    }

    public void setAluno(Aluno aluno) {
        this.aluno.add(aluno);
    }
    @Override
    public String toString() {
        return "Curso [codigo=" + codigo + ", nome=" + nome + ", cargaHorariaTotal=" + cargaHorariaTotal
                + ", disciplinas=" + disciplinas + ", aluno=" + aluno + "]";
    }
}
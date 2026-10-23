package Questões.SistemaCursos;
import java.util.ArrayList;
import java.util.List;
public class Turma {
    private String codigoTurma;
    private int ano;
    private int semestreLetivo;
    private String horario;
    private int vagas;
    private List<Disciplina> disciplinas;
    private List<Professor> professor;
    private List<Aluno> matriculas;
    public Turma() {
    }
    public Turma(String codigoTurma, int ano, int semestreLetivo, String horario, int vagas) {
        this.codigoTurma = codigoTurma;
        this.ano = ano;
        this.semestreLetivo = semestreLetivo;
        this.horario = horario;
        this.vagas = vagas;
        this.disciplinas = new ArrayList<>();
        this.professor = new ArrayList<>();
        this.matriculas = new ArrayList<>();
    }
    public Turma(String codigoTurma, int ano, int semestreLetivo, String horario, int vagas, List<Disciplina> disciplinas, List<Professor> professor, List<Aluno> alunos) {
        this.codigoTurma = codigoTurma;
        this.ano = ano;
        this.semestreLetivo = semestreLetivo;
        this.horario = horario;
        this.vagas = vagas;
        this.disciplinas = disciplinas;
        this.professor = professor;
    }
    public Turma(String codigoTurma, int ano, int semestreLetivo, String horario, int vagas, Disciplina disciplina, Professor professor) {
        this.codigoTurma = codigoTurma;
        this.ano = ano;
        this.semestreLetivo = semestreLetivo;
        this.horario = horario;
        this.vagas = vagas;
        this.disciplinas = new ArrayList<>();
        this.disciplinas.add(disciplina);
        this.professor = new ArrayList<>();
        this.professor.add(professor);
        this.matriculas = new ArrayList<>();
    }
    public String getCodigoTurma() {
        return codigoTurma;
    }
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getSemestreLetivo() {
        return semestreLetivo;
    }
    public void setSemestreLetivo(int semestreLetivo) {
        this.semestreLetivo = semestreLetivo;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public int getVagas() {
        return vagas;
    }
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public List<Professor> getProfessor() {
        return professor;
    }
    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }
    public List<Aluno> getMatriculas() {
        return matriculas;
    }
    public void setMatriculas(List<Aluno> matriculas) {
        this.matriculas = matriculas;
    }
    @Override
    public String toString() {
        return "Turma [codigoTurma=" + codigoTurma + ", ano=" + ano + ", semestreLetivo=" + semestreLetivo
                + ", horario=" + horario + ", vagas=" + vagas + ", disciplinas=" + disciplinas + ", professor="
                + professor + ", matriculas=" + matriculas + "]";
    }

}
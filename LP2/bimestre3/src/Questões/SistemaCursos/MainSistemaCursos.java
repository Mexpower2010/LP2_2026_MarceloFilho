package Questões.SistemaCursos;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MainSistemaCursos {
    final static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();
        List<Turma> turmas = new ArrayList<>();
        boolean sair = false;
        while (true) {
            if (sair) {
                break;
            }
            System.out.println("=== Sistema de Gerenciamento de Cursos ===");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Curso");
            System.out.println("3 - Cadastrar Disciplina");
            System.out.println("4 - Cadastrar Professor");
            System.out.println("5 - Cadastrar Turma");
            System.out.println("6 - Imprimir tudo");
            System.out.println("7 - Sair");
            int opcao = s.nextInt();
            s.nextLine(); // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno("Alice", "MAT001", null, null, "alice@university.edu", 'C');
                    alunos.add(aluno);
                    break;
                case 2:
                    Curso curso = new Curso("CUR001", "Engenharia de Software", 240);
                    cursos.add(curso);
                    break;
                case 3:
                    Disciplina disciplina = new Disciplina("DIS001", "Introdução à Programação", 60, "Curso introdutório sobre programação.", cursos.get(0));
                    disciplinas.add(disciplina);
                    break;
                case 4:
                    Professor professor = new Professor("MAT001", "João da Silva", "joao.silva@university.edu", "Doutorado");
                    professores.add(professor);
                    break;
                case 5:
                    Turma turma = cadastrarTurma(alunos, disciplinas, professores, "COD123", 2024, 1, "08:00 - 10:00", 30);
                    turmas.add(turma);
                    break;
                case 6:
                    System.out.println(alunos.toString());
                    System.out.println(cursos.toString());
                    System.out.println(disciplinas.toString());
                    System.out.println(professores.toString());
                    System.out.println(turmas.toString());
                    System.out.println("=== Fim da impressão ===");
                    System.out.println("Digite qualquer tecla para continuar...");
                    s.nextLine(); // Espera o usuário pressionar Enter
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    public static Turma cadastrarTurma(List<Aluno> alunos, List<Disciplina> disciplinas, List<Professor> professores, String codigoTurma, int ano, int semestreLetivo, String horario, int vagas) {
        Turma turma = new Turma( codigoTurma,  ano,  semestreLetivo,  horario,  vagas,  disciplinas,  professores,  alunos);

        return turma;
    }
}

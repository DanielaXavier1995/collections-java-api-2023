package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorDeAlunos() {
        alunosSet = new HashSet<>();
    }

    private void adicionarAluno(String nome, Long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    private void removerAluno(long matricula) {
        Aluno alunoRemovido = null;
        for (Aluno a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunoRemovido = a;
                System.out.println("O aluno: " + a.getNome() + " foi removido com sucesso!");
                break;
            }
        }
        alunosSet.remove(alunoRemovido);
    }

    private Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNomeSet = new TreeSet<>(alunosSet);
        return alunoPorNomeSet;
    }

    private Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNotaSet = new TreeSet<>(new ComparetorPorNota());

        alunoPorNotaSet.addAll(alunosSet);

        return alunoPorNotaSet;
    }

    private void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorDeAlunos gerenciadorDeAlunos = new GerenciadorDeAlunos();

        gerenciadorDeAlunos.exibirAlunos();

        gerenciadorDeAlunos.adicionarAluno("Aluno1", 1l, 7D);
        gerenciadorDeAlunos.adicionarAluno("Aluno2", 2l, 9D);
        gerenciadorDeAlunos.adicionarAluno("Aluno3", 3l, 10D);
        gerenciadorDeAlunos.adicionarAluno("Aluno5", 5l, 6.5D);
        gerenciadorDeAlunos.adicionarAluno("Aluno4", 4l, 5D);

        gerenciadorDeAlunos.exibirAlunos();

        gerenciadorDeAlunos.removerAluno(5l);

        gerenciadorDeAlunos.exibirAlunos();

        System.out.println(gerenciadorDeAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorDeAlunos.exibirAlunosPorNota());
    }
}

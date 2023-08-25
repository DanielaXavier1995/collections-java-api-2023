package set.pesquisa;

import com.sun.tools.javac.Main;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefasSet;
    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }
    public void adicionarTarefa(Tarefa tarefa) {
        tarefasSet.add(tarefa);
    }
    public void removerTarefa(String descricao) {
        for(Tarefa t: tarefasSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasSet.remove(t);
                System.out.println(t.getDescricao() + " removida com sucesso!");
                break;
            }
        }
    }
    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }
    public int contarTarefas() {
       return tarefasSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();
        for(Tarefa t: tarefasSet) {
            if(t.isConcluida()) {
                tarefasConcluidasSet.add(t);
            }
        }
        return tarefasConcluidasSet;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();
        for(Tarefa t: tarefasSet) {
            if(!t.isConcluida()) {
                tarefasPendentesSet.add(t);
            }
        }
        return tarefasPendentesSet;
    }
    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t: tarefasSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                System.out.println("Tarera concluída: " + t.getDescricao());
                break;
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for(Tarefa t: tarefasSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente = t;
                break;
            }
        }

        if(tarefaPendente != null) {
            tarefaPendente.setConcluida(false);
            System.out.println("Tarera pendente: " + tarefaPendente.getDescricao());
        } else {
            System.out.println("Tarefa não encontrada na lista!");
        }
    }
    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefas();

        listaTarefas.adicionarTarefa(new Tarefa( "Tarefa 1"));
        listaTarefas.adicionarTarefa(new Tarefa( "Tarefa 2"));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 3"));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 4"));

        listaTarefas.exibirTarefas();
        System.out.println("Quantidade de tarefas na lista: " + listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Tarefa 3");
        listaTarefas.marcarTarefaPendente("Tarefa 4");
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Tarefa 3");
        System.out.println("Quantidade de tarefas na lista: " + listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}

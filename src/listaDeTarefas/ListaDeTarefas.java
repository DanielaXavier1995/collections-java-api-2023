package listaDeTarefas;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefas> listaTarefas;

    //Construtor que tem por objetivo criar uma lista vazia ao instanciar o objeto ListaDeTarefas
    public ListaDeTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefas> listaTarefasDeletadas = new ArrayList<>();
        for (Tarefas t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefasDeletadas.add(t);
            }
        }
        listaTarefas.removeAll(listaTarefasDeletadas);
    }

    public int obterNumeroTotalTarefas() {
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }
    public static void main(String[] args) {
        //Instanciar
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        //Obter numero de tarefas
        System.out.println(listaDeTarefas.obterNumeroTotalTarefas());

        //Adicionando tarefas
        listaDeTarefas.adicionarTarefa("Tarefa 01");
        listaDeTarefas.adicionarTarefa("Tarefa 02");

        //Obter numero de tarefas
        System.out.println("Voce possui " + listaDeTarefas.obterNumeroTotalTarefas() + "tarefas");

        //Remover tarefa
        listaDeTarefas.removerTarefa("Tarefa 02");
        //Obter numero de tarefas
        System.out.println(listaDeTarefas.obterNumeroTotalTarefas());

        //Obter descrição das tarefas
        listaDeTarefas.obterDescricoesTarefas();



    }
}

package list.listaDeTarefas;
public class Tarefas {
    private String descricao;

    public Tarefas() {

    }
    public Tarefas(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "descricao= " + descricao;
    }
}

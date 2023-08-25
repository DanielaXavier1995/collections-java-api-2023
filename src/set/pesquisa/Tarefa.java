package set.pesquisa;

import java.util.Objects;

public class Tarefa {
    private boolean concluida;
    private String descricao;
    public Tarefa(String descricao) {
        this.concluida = false;
        this.descricao = descricao;
    }
    public Tarefa() {

    }
    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return getDescricao().equals(tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "status=" + concluida +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

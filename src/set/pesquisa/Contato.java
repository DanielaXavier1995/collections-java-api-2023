package set.pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numeroDeTelefone;
    public Contato(String nome, int numeroDeTelefone) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
    }
    public Contato() {

    }
    public String getNome() {
        return nome;
    }
    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }
    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNumeroDeTelefone() == contato.getNumeroDeTelefone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeroDeTelefone());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroDeTelefone=" + numeroDeTelefone +
                '}';
    }
}

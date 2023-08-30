package map.ordenacao;
public class Evento {
    private String nome;
    private String atracao;
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Evento{" +
                "nomeDoEvento='" + nome + '\'' +
                ", nomeAtracao='" + atracao + '\'' +
                '}';
    }
}

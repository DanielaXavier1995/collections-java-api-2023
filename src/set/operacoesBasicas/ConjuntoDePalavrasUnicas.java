package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;
public class ConjuntoDePalavrasUnicas {
    private Set<String> palavrasUnicasSet;
    public ConjuntoDePalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()) {
            palavrasUnicasSet.remove(palavra);
        } else {
            System.out.println("Conjunto vazio");
        }
    }
    public boolean verificarPalavra(String palavra) {
        boolean verificacaoPalavra = false;
        if(!palavrasUnicasSet.isEmpty()) {
           verificacaoPalavra = palavrasUnicasSet.contains(palavra);
        } else {
            System.out.println("Conjunto vazio");
        }
        return verificacaoPalavra;
    }
    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("Conjunto vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoDePalavrasUnicas conjuntoDePalavrasUnicas = new ConjuntoDePalavrasUnicas();

        //Adicionar
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 5");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 6");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 6");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 7");
        conjuntoDePalavrasUnicas.adicionarPalavra("Palavra 8");

        conjuntoDePalavrasUnicas.exibirPalavrasUnicas();

        //Verificar se existe:
        System.out.println("A palavra existe? " + conjuntoDePalavrasUnicas.verificarPalavra("Palavra 5"));
        System.out.println("A palavra existe? " + conjuntoDePalavrasUnicas.verificarPalavra("Palavra 10"));

        //Deletar palavra:
        conjuntoDePalavrasUnicas.removerPalavra("Palavra 7");
        conjuntoDePalavrasUnicas.exibirPalavrasUnicas();
    }
}

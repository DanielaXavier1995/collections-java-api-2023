package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;
    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
            System.out.println(palavra + " removida com sucesso!");
        } else {
            System.out.println("Map vazio!");
        }
    }
    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String resultado = null;
        if(!dicionarioMap.isEmpty()) {
            resultado = dicionarioMap.get(palavra);
        } else {
            System.out.println("Map vazio!");
        }
        return resultado;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("mesa", "kkkkkk");
        dicionario.adicionarPalavra("cadeira", "ddd");
        dicionario.adicionarPalavra("garrafa", "aaaa");
        dicionario.adicionarPalavra("anel", "bbbhb");
        dicionario.adicionarPalavra("tela", "tttttt");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("garrafa");

        System.out.println(dicionario.pesquisarPorPalavra("tela"));
    }
}

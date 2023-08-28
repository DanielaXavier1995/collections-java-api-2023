package map.ordenacao;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;
    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra) {
        if(!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
            System.out.println(palavra + " removida com sucesso!");
        }
    }
    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int contadorPalavra = 0;
        if(!contagemPalavrasMap.isEmpty()) {
            for(Map.Entry<String, Integer> entry: contagemPalavrasMap.entrySet()) {
                if(entry.getValue() > contadorPalavra) {
                    contadorPalavra = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente + " com " + contadorPalavra + " ocorrências");
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra1", 2);
        contagemPalavras.adicionarPalavra("Palavra2", 45);
        contagemPalavras.adicionarPalavra("Palavra3", 10);
        contagemPalavras.adicionarPalavra("Palavra4", 6);
        contagemPalavras.adicionarPalavra("Palavra5", 13);
        contagemPalavras.adicionarPalavra("Palavra6", 8);
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Palavra3");
        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.encontrarPalavraMaisFrequente();
    }
}

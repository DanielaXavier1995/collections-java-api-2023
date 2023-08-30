package map.ordenacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livrariaOnlineMap;
    public LivrariaOnline() {
        this.livrariaOnlineMap = new HashMap<>();
    }
    public void adicionarLivro(String link, Livro livro) {
        livrariaOnlineMap.put(link, livro);
    }
    public void removerLivro(String titulo) {
        List<String> chavesRemovidas = new ArrayList<>();
        for(Map.Entry<String, Livro> entry: livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemovidas.add(entry.getKey());
            }
        }

        for(String chaves: chavesRemovidas) {
            livrariaOnlineMap.remove(chaves);
        }
    }
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        return new TreeMap<>(livrariaOnlineMap);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutorMap = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry: livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutorMap.put(entry.getKey(), entry.getValue());
            }
        }
        return livrosPorAutorMap;
    }
    public List<Livro> obterLivroMaisCaro() {
        double precoMaisCaro = Double.MIN_VALUE;
        List<Livro> livrosMaisCaros = new ArrayList<>();
        for(Livro l:livrariaOnlineMap.values()) {
            if(l.getPreco() >= precoMaisCaro) {
                precoMaisCaro = l.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry: livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisCaro) {
                livrosMaisCaros.add(entry.getValue());
            }
        }
        return livrosMaisCaros;
    }

    public List<Livro> exibirLivroMaisBarato() {
        double precoMaisBarato = Double.MAX_VALUE;
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        for(Livro l:livrariaOnlineMap.values()) {
            if(l.getPreco() < precoMaisBarato) {
                precoMaisBarato = l.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry: livrariaOnlineMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBarato) {
                livrosMaisBaratos.add(entry.getValue());
            }
        }

        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println("Lista ordenada por preco: " + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println(livrariaOnline.obterLivroMaisCaro());

        System.out.println(livrariaOnline.exibirLivroMaisBarato());

        livrariaOnline.removerLivro("Malorie");

        System.out.println("Lista ordenada por preco: " + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("George Orwell"));
    }
}

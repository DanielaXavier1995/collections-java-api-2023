package list.pesquisa;

import java.util.ArrayList;
import java.util.List;
public class CatalogoDeLivros {
    private List<Livro> livrosList = new ArrayList<>();
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosMesmoAutorList = new ArrayList<>();
        if(!livrosList.isEmpty()) {
           for (Livro livro: livrosList) {
               if(livro.getAutor().equalsIgnoreCase(autor)) {
                   livrosMesmoAutorList.add(livro);
               }
           }
         } else {
            throw new RuntimeException("Lista vazia!");
        }
        return livrosMesmoAutorList;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos (int anoInicial, int anoFinal){
        List <Livro> livrosPorIntervaloDeAnosList = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro livro: livrosList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnosList.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAnosList;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()) {
            for (Livro l: livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoDeLivros catalogoDeLivros = new CatalogoDeLivros();
        catalogoDeLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoDeLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoDeLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoDeLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoDeLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoDeLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoDeLivros.pesquisarPorIntervaloDeAnos(2020, 2023));
        System.out.println(catalogoDeLivros.pesquisarPorTitulo("Livro 1"));
    }
}

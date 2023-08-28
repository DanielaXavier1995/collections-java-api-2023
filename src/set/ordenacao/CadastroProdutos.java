package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome() {

        Set<Produto> produtosPorNomeSet = new TreeSet<>(produtoSet);

        return produtosPorNomeSet;
    }
    public Set<Produto> exibirProdutosPorPreco() {

        Set<Produto> produtosPorPrecoSet = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPrecoSet.addAll(produtoSet);
        return produtosPorPrecoSet;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos.produtoSet);

        cadastroProdutos.adicionarProduto(1l, "Produto 1", 15d, 5);
        cadastroProdutos.adicionarProduto(2l, "Produto 9", 120d, 10);
        cadastroProdutos.adicionarProduto(1l, "Produto 2", 10d, 1);
        cadastroProdutos.adicionarProduto(9l, "Produto 0", 35d, 50);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

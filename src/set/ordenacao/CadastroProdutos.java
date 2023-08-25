package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
public class CadastroProdutos {
    Set<Produto> produtoSet;
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome() {

    }
    public Set<Produto> exibirProdutosPorNome() {

    }
}
